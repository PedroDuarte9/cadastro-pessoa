package br.com.cadastropessoas.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
    private static final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("teste");

    public static EntityManager getEntityManager(){
        return EMF.createEntityManager();
    }
}
