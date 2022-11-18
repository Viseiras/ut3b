package com.dam2.javiervicedo;

import com.dam2.javiervicedo.herencia.Animal;
import com.dam2.javiervicedo.herencia.Gato;
import com.dam2.javiervicedo.manytomany.Estudiante;
import com.dam2.javiervicedo.manytomany.Modulo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class AppHerencia {
    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction t = ss.beginTransaction();
        Animal a = new Animal("oviparo");
        Gato g = new Gato("mamifero",7);
        ss.persist(g);
        t.commit();
        ss.close();
    }
}
