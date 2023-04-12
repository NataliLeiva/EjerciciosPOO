/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author sosar
 */
public class Cajero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 System.out.println("Bienvenido a la red de cajeros Natali");//mensaje de bienvenida
        Scanner leer = new Scanner(System.in);
        Cuenta cliente = new Cuenta();//creamos el objeto "cliente" en la clase Cuenta

        String resp;
        cliente.setSaldo(30000);//le asignamos un valor a saldo
        cliente.setTitular("Teo");//asignamos un nombre al cliente (tambien podriamos pedirlo por consola pero 
                                   //damos por sentado que ingresa una tarjeta con su nombre.

        System.out.println("Titular " + cliente.getTitular());//mostramos por pantalla el nombre del titular
        do { //repetir
            cliente.retirar_dinero();
            System.out.println("¿Desea relizar otra operacion? para continuar presione (s) si desea salir presione calquier tecla ");
             resp = leer.next();
        } while (resp.equalsIgnoreCase("s"));//mientras que la respuesta sea distinta de "S"
        System.out.println("Gracias Red Natali");

    }
    
}
