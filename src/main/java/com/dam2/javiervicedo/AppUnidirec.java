package com.dam2.javiervicedo;

import com.dam2.javiervicedo.unidirec.Deporte;
import com.dam2.javiervicedo.unidirec.Deportista;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.io.Serializable;

public class AppUnidirec {
    public static void main(String[] args) {
        SessionFactory sf= HibernateUtil.getSessionFactory();
        Session ss= sf.openSession();
        Transaction t = ss.beginTransaction();

        Deporte d1= new Deporte("Waterpolo");
        Deportista dpt1 = new Deportista("Manel Estiarte",d1);
        //ss.persist(d1);
        ss.persist(dpt1);
        t.commit();
        ss.close();
    }
}
