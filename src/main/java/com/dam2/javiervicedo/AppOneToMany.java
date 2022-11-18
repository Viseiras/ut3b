package com.dam2.javiervicedo;

import com.dam2.javiervicedo.onetomany.Alumno;
import com.dam2.javiervicedo.onetomany.Profesor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class AppOneToMany {
    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction t = ss.beginTransaction();
        Alumno a1 = new Alumno("Jonathan",32,null);
        Alumno a2 = new Alumno("Samuel",26,null);
        List<Alumno> alumnos = new ArrayList<>();
        Profesor profesor = new Profesor("Miguel Sánchez",4200,alumnos);
        a1.setProfesor(profesor);
        a2.setProfesor(profesor);

        ss.persist(a2);
        t.commit();
        ss.close();
    }
}
