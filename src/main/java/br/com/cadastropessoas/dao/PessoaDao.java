package br.com.cadastropessoas.dao;

import br.com.cadastropessoas.model.entities.Pessoa;

import javax.persistence.EntityManager;

public class PessoaDao {
    private EntityManager em;

    public PessoaDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Pessoa pessoa){
        this.em.getTransaction().begin();
        this.em.persist(pessoa);
        this.em.getTransaction().commit();
        this.em.close();
    }

    public void remover(Pessoa pessoa){
        this.em.remove(pessoa);
    }
}
