package com.dam2.javiervicedo;

import com.dam2.javiervicedo.single.EmpleadoSingle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class AppSingle
{
    public static void main( String[] args )
    {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction t = ss.beginTransaction();

        EmpleadoSingle e1 = new EmpleadoSingle("Lucas Moreno",5000);
        EmpleadoSingle e2 = new EmpleadoSingle("Ian Miguel",1200);
        ss.persist(e1);
        ss.persist(e2);
        t.commit();
        ss.close();
    }
}


