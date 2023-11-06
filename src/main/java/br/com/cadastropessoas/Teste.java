package br.com.cadastropessoas;
import br.com.cadastropessoas.JPAUtil.JPAUtil;
import br.com.cadastropessoas.dao.PessoaDao;
import br.com.cadastropessoas.model.entities.Endereco;
import br.com.cadastropessoas.model.entities.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Teste {
    public static void main(String[] args) {

        Pessoa p5 = new Pessoa(null, "João", "0000000000", new Endereco(null, "Rua A", "102", "Fundos", "Maracangalha", "66110-048") {
        });

        EntityManager em = JPAUtil.getEntityManager();
        PessoaDao pessoaDao = new PessoaDao(em);
        pessoaDao.cadastrar(p5);
       
    }
}
