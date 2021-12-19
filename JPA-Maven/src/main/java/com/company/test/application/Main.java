package com.company.test.application;

import com.company.test.domain.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person(null, "Test", "test@gmail.com");


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("example-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(p1);
        em.getTransaction().commit();

        System.out.println("Finished!");

    }
}
