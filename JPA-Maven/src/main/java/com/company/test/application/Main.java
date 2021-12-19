package com.company.test.application;

import com.company.test.domain.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("example-jpa");
        EntityManager em = emf.createEntityManager();
        Person p = em.find(Person.class, 2);

        System.out.println(p);

        System.out.println("Finished!");

        em.close();
    }
}
