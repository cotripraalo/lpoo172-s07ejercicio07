/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07ejercicio07;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S07ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Creando objeto Scanner
        Scanner input = new Scanner(System.in);
        
        //Mostrando mensaje al usuario
        System.out.println("INGRESE LA DISTANCIA A RECORRER: ");
        double distancia = input.nextDouble();
        
        System.out.println("INGRESE MILLAS POR GALON: ");
        double millasporgalon = input.nextDouble();
        
        System.out.println("INGRESE PRECIO POR GALON: ");
        double precioporgalon = input.nextDouble();
        
        //Calculando el costo de viaje en auto
        double costoviaje = (distancia / millasporgalon)* precioporgalon;
        
        //Mostrando resultado
        System.out.println("EL COSTO DE VIAJE EN AUTO ES $" + costoviaje);
        
    }
    
}
