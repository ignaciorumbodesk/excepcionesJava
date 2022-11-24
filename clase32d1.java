/** 
@author Ignacio Rumbo
CaC inicial 2022
*/


/* DESAFIO 1
    * Crear una función que eleve un número a una potencia, ambos cargados por teclado. 
    * Tener en cuenta que el tipo de datos se corresponda con lo declarado.
    * Tener en cuenta las indefiniciones matemáticas para lanzar las excepciones.
 */


package clase32;

import java.util.InputMismatchException;
import java.util.Scanner;

public class clase32d1 {

    //funciones

    static double potenciacion(double base, double exponente) throws ArithmeticException {
       double p;
        if (exponente != 0) {
            p = Math.pow(base, exponente);
        if (exponente == 1){
            System.out.println("Cualquier exponente elevado a 1, siempre sera 1.");3
        }
        } else {
            throw new ArithmeticException();
        }
        return p;
    }


    public static void main(String[] args) throws Exception, InputMismatchException {
        
        //objetos
        Scanner teclado = new Scanner(System.in);


        //variables
        double base = 0, exponente = 0, resultado = 0;

        
        //entrada y salida
        try {
            System.out.println("Ingrese un numero Base:");
            base = teclado.nextInt();
            System.out.println("Ingrese, ahora un numero Exponente");
            exponente = teclado.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("ERROR! Ingreso un valor no valido. ");
            e.printStackTrace(System.out);
        }


        //proceso
        try {
            resultado = potenciacion(base, exponente);
            System.out.println("La potencia de " + base + " es: " + resultado + ".");
     
        } catch (ArithmeticException e) {
            System.out.println("Intento calcular la potencia de 0");
        }

        System.out.println("----PROGRAMA FINALIZADO----");


    }

}