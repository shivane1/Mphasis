package com.test;

import org.hibernate.Session;
import javax.persistence.criteria.*;
import java.util.List;

public class CriteriaExample {

    public static void main(String[] args) {

        Session session = HibernateUtility.getFactory().openSession();

        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Movie> cq = cb.createQuery(Movie.class);

        Root<Movie> root = cq.from(Movie.class);
        cq.select(root).where(cb.gt(root.get("rating"), 8));

        List<Movie> list = session.createQuery(cq).getResultList();

        for (Movie m : list) {
            System.out.println(m.getName());
        }

        session.close();
    }
}



