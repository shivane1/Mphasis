package com.test;

import org.hibernate.Session;
import org.hibernate.query.Query;
import java.util.List;

public class HQLExample {

    public static void main(String[] args) {

        Session session = HibernateUtility.getFactory().openSession();

        Query<Movie> q = session.createQuery("from Movie where rating > 8", Movie.class);

        List<Movie> list = q.list();

        for (Movie m : list) {
            System.out.println(m.getName());
        }

        session.close();
    }
}
