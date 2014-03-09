package zepp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Zepp on 09.03.14.
 */
public class Starter {
    public static void main(String[] args) {
        //EntityManagerFactory factory = Persistence.createEntityManagerFactory("NewPersistenceUnit");
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("NewPersistenceUnitHibernate");
        EntityManager em = factory.createEntityManager();
        Us us = new Us("user1","user");
        Us us2 = new Us("admin2","admin");
        em.getTransaction().begin();
        em.persist(us);
        em.persist(us2);
        em.getTransaction().commit();
        em.close();
    }
}
