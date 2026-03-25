package com.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class InsertData {

    public static void main(String[] args) {

        Session session = HibernateUtility.getFactory().openSession();
        Transaction tx = session.beginTransaction();

        Movie2D m1 = new Movie2D();
        m1.setName("KGF");
        m1.setRating(9.0);
        m1.setCasting("Yash");

        Movie3D m2 = new Movie3D();
        m2.setName("Avatar");
        m2.setRating(8.5);
        m2.setTechnology("IMAX");

        session.save(m1);
        session.save(m2);

        tx.commit();
        session.close();

        System.out.println("Data Inserted");
    }
}
