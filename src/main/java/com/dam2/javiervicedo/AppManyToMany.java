package com.dam2.javiervicedo;

import com.dam2.javiervicedo.manytomany.Estudiante;
import com.dam2.javiervicedo.manytomany.Modulo;
import com.dam2.javiervicedo.onetomany.Alumno;
import com.dam2.javiervicedo.onetomany.Profesor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class AppManyToMany {
    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction t = ss.beginTransaction();
        /*
        Estudiante e1 = new Estudiante("Jonathan",32,null);
        Estudiante e2 = new Estudiante("Samuel",26,null);
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(e1);estudiantes.add(e2);
        Modulo m1 = new Modulo("Acceso a datos",140,estudiantes);
        Modulo m2 = new Modulo("Programación multimedia",140,estudiantes);
        List<Modulo> modulos = new ArrayList<>();
        modulos.add(m1);modulos.add(m2);
        e1.setModulo(modulos);
        e2.setModulo(modulos);
        ss.persist(m1);
        t.commit();
        ss.close();
        */
        List<Modulo> modulos=new ArrayList<>();
        Modulo m3 = new Modulo("Desarrollo de interfaces",100,null);
        modulos.add(m3);
        Estudiante e3 = new Estudiante("Nacho Perez",21,modulos);
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(e3);
        ss.persist(estudiantes);
        t.commit();
        ss.close();
    }
}
