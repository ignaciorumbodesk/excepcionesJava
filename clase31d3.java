package clase31;

public class clase31d3 {
    
    /*
     * FUNCIONES
     * programo la funcion DIVIDIR con un lanzamiento de excepciones.
     */

     public static double accederArray(double []v, int j){
        if (0 <=  j && j <= v.length) {
            return v[j];
        } else {
            //si el indice no existe arrojo una excepcion.
            throw new ArrayIndexOutOfBoundsException("el indice "+ j +" no existe en el vector.");
        }
     }
    public static void main(String[] args) {
        
        //declaracion e inicializacion del array
        double []v = new double[15];

        //proceso

        try {
            accederArray(v, 88);
            System.out.println("El indice indicado existe. No se produjo excepcion alguna.");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("El indice indicado no existe. Se produjo una excepcion.");
        } finally {
            System.out.println("Busqueda finalizada.");
        }

    }
}
