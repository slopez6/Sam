/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicios.proyectosueldo;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Sam
 */
public class ProyectoSueldo {

    public static void main(String[] args) {
        
        double sueldo = 0;
        double renta = 0.10;
        double afp = 0.0725;
        double seguro = 0.03;
        
        double descuentoRenta = (sueldo * renta);
        double descuentoAfp = (sueldo * afp);
        double descuentoSeguro = (sueldo * seguro);
        
            
        double sueldoNeto =  sueldo - descuentoRenta - descuentoAfp - descuentoSeguro;
        System.out.println("Sueldo Neto: " + sueldoNeto);
        
    }
}
