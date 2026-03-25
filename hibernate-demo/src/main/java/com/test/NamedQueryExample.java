package com.test;

import org.hibernate.Session;
import java.util.List;

public class NamedQueryExample {

    public static void main(String[] args) {

        Session session = HibernateUtility.getFactory().openSession();

        List<Movie> list =
                session.createNamedQuery("Movie.findAll", Movie.class).list();

        for (Movie m : list) {
            System.out.println(m.getName());
        }

        session.close();
    }
}
