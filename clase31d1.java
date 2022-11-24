/*

*Realizaremos una función división, la dividiremos por 0 y observaremos el resultado.
*Agregaremos lanzamientos de excepciones y bloques try catch que gestionen los errores y permitan una salida más correcta del programa. 
*Clase Division y ExDivision del repo.

 */

package clase31;
import java.util.*;
public class clase31d1 {

    static double division(double numDividendo, double numDivisor) throws ArithmeticException {
        double divResult;

        if (numDivisor != 0) {
            divResult = numDividendo / numDivisor;
        } else {
            throw new ArithmeticException();
        }
         return divResult;
     }

     public static void main(String[] args) throws Exception, InputMismatchException{
       
        //variables
        double numDividendo = 0, numDivisor = 1, resultado;

        //scanner teclado
        Scanner teclado = new Scanner(System.in);

        //Entrada y Salida
        try {
            System.out.println("ingrese un numero");
            numDividendo = teclado.nextDouble();
            System.out.println("ingrese otro numero");
            numDivisor = teclado.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar Obligatoriamente un numero entero. \n" );
            System.exit(0);
        }


        //proceso
        try {
            resultado = division(numDividendo, numDivisor);
            System.out.println("el resultado de la division es:" + resultado);
        } catch (ArithmeticException e1) {
            System.out.println("Intentaste dividir por 0. a" + e1);
        } catch (Exception e2) {
            System.out.println("la operacion no puede realizarse.");
        } finally {
            System.out.println("El sistema ha finalizado");
        }
    
        
    }
}
