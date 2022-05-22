/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mantenimiento;

import Entity.Contribuyente;
import javax.persistence.EntityManager;

/**
 *
 * @author Sam
 */
public class Mante {
    
    
     public void guardar(Contribuyente co) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        int flag = 0;
        em.getTransaction().begin();
        try {
            em.persist(co);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }


    public Contribuyente Consultar(String nit) {
        javax.persistence.EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        Contribuyente cc = null;
        em.getTransaction().begin();
        try {
            cc = em.find(Contribuyente.class, nit);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return cc;
    }

    public void modificar(String nit, String nombre,
            String razon, String representante, double renta, String fecha, int estado) {
        javax.persistence.EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        Contribuyente cc = null;
        int flag = 0;
        em.getTransaction().begin();
        try {
            cc = em.find(Contribuyente.class, nit);

            cc.setNombreContribuyente(nombre);
            cc.setRazonSocial(razon);
            cc.setRepresentanteLegal(representante);
            cc.setRentaAnual(renta);
            cc.setFechaRegistro(fecha);
            cc.setEstadoContribuyente(representante);

            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public int eliminar(String nit) {
        javax.persistence.EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
       Contribuyente cc = null;
        int flag = 0;
        em.getTransaction().begin();
        try {
           cc = em.find(Contribuyente.class, nit);
            em.remove(cc);
            em.getTransaction().commit();
            flag = 1;
        } catch (Exception e) {
            em.getTransaction().rollback();
            flag = 0;
        } finally {
            em.close();
        }
        return flag;
    }
}
