package br.com.cadastropessoas.dao;

import br.com.cadastropessoas.JPAUtil.JPAUtil;

import javax.persistence.EntityManager;

public class DAOGeneric<E> {

    private JPAUtil jpaUtil;
    private EntityManager em;
    private Class<E> entidade;

    static {
        try {
            JPAUtil.getEntityManager();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public DAOGeneric(Class<E> entidade) {
        this.entidade = entidade;
        JPAUtil.getEntityManager();
    }

    public DAOGeneric<E> cadastra(E entidade){
        this.em.persist(entidade);
        return this;
    }
}
