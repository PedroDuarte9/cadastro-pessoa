package br.com.cadastropessoas;

import br.com.cadastropessoas.JPAUtil.JPAUtil;
import br.com.cadastropessoas.dao.DAOGeneric;
import br.com.cadastropessoas.dao.PessoaDao;
import br.com.cadastropessoas.model.entities.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Teste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Pedro");

        EntityManager em = JPAUtil.getEntityManager();
        //PessoaDao pessoaDao = new PessoaDao(em);
        DAOGeneric<Pessoa> daoGeneric = new DAOGeneric<>(Pessoa.class);

         em.getTransaction().begin();
         daoGeneric.cadastra(pessoa);
         em.getTransaction().commit();
         em.close();

        System.out.println();


    }
}
