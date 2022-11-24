/*
 *  Realizaremos un ingreso numérico por teclado, y calcularemos el cuadrado de un número
    Lanzaremos la excepción desde el método main.
    Gestionaremos la excepción mediante bloques try catch para que nos que permitan una salida más correcta del programa. 
    Clases ExTipos y ExTiposBucles del repo
 */


package clase31;

import java.util.*;

public class clase31d2 {
    
    public static void main(String[] args) {

        //obj. teclado
        Scanner teclado = new Scanner(System.in);

        //variables
        int numero, resultado;

        // e-s
        try {
            System.out.println("Bienvenido \n" + "Ingrese un numero:");
            numero = teclado.nextInt();  
        //proceso
            resultado = numero * numero;
            System.out.println("El cuadrado del numero ingresado es:\n " + resultado + ".");
        
        } catch (InputMismatchException ex) {
            System.out.println("Debe ingresar un numero entero");
        }
    }
}
