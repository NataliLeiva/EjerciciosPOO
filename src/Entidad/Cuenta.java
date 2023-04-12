
package Entidad;

import java.util.Scanner;

/**
 *
 * @author sosar
 */
public class Cuenta {
    
   //ATRIBUTOS PRIVADOS SALDO Y TITULAR
    private int saldo;
    private String titular;
//CONSTRUCTOR "Cuenta" QUE NO RECIBE PARAMETROS
    public Cuenta() {
    }
//CONSTRUCTOR "Cuenta" QUE RECIBE POR PARAMETRO LOS ATRIBUTOS INVOCADOS CON EL OBJETO
    public Cuenta(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }
//METODO DONDE SE REALIZAN LAS OPERACIONES
    public void retirar_dinero() {
        int retiro;
        Scanner leer = new Scanner(System.in);
        int respuesta2;
        System.out.println("Ingrese la opeacion que desea realiazar 1:Consulta , 2:retiro ,3:Salir");
        respuesta2 = leer.nextInt();
        switch (respuesta2) {
            case 1:
                System.out.println("Usted cuenta con $ " + this.saldo);//Muestra el saldo
                break;
            case 2:
                System.out.println("Ingrese la cantidad de dinero que desee retirar");
                retiro = leer.nextInt();

                if (retiro <= this.saldo) {//siempre que el monto a retirar no supere el saldo disponible
                    this.saldo = this.saldo - retiro;//se podrá ejecutar la accion de restar el retiro del saldo
                } else if (retiro > this.saldo) {
                    System.out.println("Saldo insuficiente");
                }
                break;
            case 3:
                System.out.println("GRACIAS POR PREFERIRNOS");
                break;
            default:
                System.out.println("Error ingrese una opcion valida");
        }


    }
//METODOS GET Y SET
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    } 
}
