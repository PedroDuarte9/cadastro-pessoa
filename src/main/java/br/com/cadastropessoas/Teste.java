package br.com.cadastropessoas;
import br.com.cadastropessoas.model.entities.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Teste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(1L, "Pedro", "29174910272");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("teste");
        EntityManager em = emf.createEntityManager();
        em.persist(pessoa);

        System.out.println("Dado persistido");
        //DAO<Pessoa> daoPessoa = new DAO<>(Pessoa.class);

    }
}
