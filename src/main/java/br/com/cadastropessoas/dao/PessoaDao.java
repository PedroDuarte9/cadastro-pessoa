package br.com.cadastropessoas.dao;

import br.com.cadastropessoas.model.entities.Pessoa;

import javax.persistence.EntityManager;

public class PessoaDao {
    private EntityManager em;

    public PessoaDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Pessoa pessoa){
        this.em.persist(pessoa);
    }

    public void findPessoaById(Long id){
        this.em.find(Pessoa.class, id);
    }
}
