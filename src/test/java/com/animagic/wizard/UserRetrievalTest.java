package com.animagic.wizard;

import org.hibernate.Session;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserRetrievalTest {
    public static void main(String[] args) {
        final Session session = Main.getSession();
        session.beginTransaction();
        User user = session.get(User.class, 2);
        session.getTransaction().commit();
        System.out.println(user.getName());
        session.close();
    }
}
