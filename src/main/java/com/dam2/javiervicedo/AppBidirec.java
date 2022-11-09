package com.dam2.javiervicedo;


import com.dam2.javiervicedo.bidirec.Empleado;
import com.dam2.javiervicedo.bidirec.Usuario;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AppBidirec {
    public static void main(String[] args) {
        SessionFactory sf= HibernateUtil.getSessionFactory();
        Session ss= sf.openSession();
        Transaction t = ss.beginTransaction();

        Usuario u1= new Usuario("Diego",null,"manin");
        Empleado e1 = new Empleado("DieGOD",4500,u1);
        u1.setEmpleado(e1);
        ss.persist(e1);
        t.commit();
        ss.close();
    }
}
