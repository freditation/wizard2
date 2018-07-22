package com.animagic.wizard;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserPersistenceTest {
    public static void main(String args[]) {
        EntityManager entityManager = Persistence
                .createEntityManagerFactory("user-unit")
                .createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        /* Persist a com.animagic.wizard.User entity */
        entityTransaction.begin();
        User user = new User("Kenny Jones", "kenny@domain.com", "07743 565 8481");
        entityManager.persist(user);
        entityTransaction.commit();
    }
}
