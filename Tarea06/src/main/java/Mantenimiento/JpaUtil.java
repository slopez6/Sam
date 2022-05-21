/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mantenimiento;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Sam
 */
public class JpaUtil {
        private static final EntityManagerFactory emf;
    static {
        try {
     emf= Persistence.createEntityManagerFactory("pers");
        } catch (Throwable ex) {
            System.out.println("initial SessionFactory create failed"+ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static EntityManagerFactory getEntityManagerFactory() {
 return emf;
    }
}
