package com.test;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {

    private static final SessionFactory factory =
            new Configuration().configure().buildSessionFactory();

    public static SessionFactory getFactory() {
        return factory;
    }
}
