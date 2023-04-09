package cmjm.proyecto.ed;

import java.util.Scanner;

/**
 *
 * La nota final de un alumno queda definida por:
 * <ul>
 * <li><code>Nota 1.</code></li>
 * <li><code>Nota 2.</code></li>
 * <li><code>Nota 3.</code></li>
 * </ul>
 * @see #metodoPrimeraNota(double) 
 * @see #mediaNotasParciales(double, double, double) 
 * En base a estas tres variables se calcula la media de las dos mejores notas
 * obtenidas.
 * @author Jesús Manuel Cano Martín
 */
public class ProyectoED {

    /**
     * Objeto de la clase Scanner utilizado para leer los datos del usuario
     * desde el teclado.
     */
    static Scanner teclado = new Scanner(System.in);

    /**
     * Método principal que inicia la ejecución del programa.
     *
     * @param args Los argumentos de línea de comandos. No se utilizan en este
     * programa.
     */
    public static void main(String[] args) {
/**
 * Variable tipo double: nota1
 * Una nota queda definida por un valor comprendido entre 0 y 10.
 * Estos valores pueden incluir decimales.
 */
        double nota1 = 0;
 /**
 * Variable tipo double: nota2
 * Una nota queda definida por un valor comprendido entre 0 y 10.
 * Estos valores pueden incluir decimales.
 */       
        double nota2;
 /**
 * Variable tipo double: nota3
 * Una nota queda definida por un valor comprendido entre 0 y 10.
 * Estos valores pueden incluir decimales.
 */
        double nota3;
        
        nota1 = metodoPrimeraNota(nota1);

        System.out.print("Introduce la segunda nota: ");
        nota2 = teclado.nextDouble();

        while (nota2 > 10 || nota2 < 0) {
            System.out.println("La nota introducida no es valida, vuelva a intentarlo.");
            nota2 = teclado.nextDouble();
        }

        System.out.print("Introduce la tercera nota: ");
        nota3 = teclado.nextDouble();

        while (nota3 > 10 || nota3 < 0) {
            System.out.println("La nota introducida no es valida, vuelva a intentarlo.");
            nota3 = teclado.nextDouble();
        }

        mediaNotasParciales(nota1, nota2, nota3);

    }
    /**
     * Método que pide al usuario que introduzca por teclado un double
     *
     * @param nota1 recibe un double
     * @return double nota1 que es el valor introducido por teclado
     */
    public static double metodoPrimeraNota(double nota1) {
        System.out.print("Introduce la primera nota: ");
        nota1 = teclado.nextDouble();
        while (nota1 > 10 || nota1 < 0) {
            System.out.println("La nota introducida no es valida, vuelva a intentarlo.");
            nota1 = teclado.nextDouble();
        }
        return nota1;
    }

    /**
     * Método que calcula la media de las dos mejores notas en base a 3 notas
     * pasadas por parametros.
     *
     * @param nota1 La primera nota parcial.
     * @param nota2 La segunda nota parcial.
     * @param nota3 La tercera nota parcial.
     * @return double media. <code> (notaX+notaY)/2</code>
     */
    public static double mediaNotasParciales(double nota1, double nota2, double nota3) {
        double media;

        if ((nota1 < 0 || nota1 > 10) || (nota2 < 0 || nota2 > 10) || (nota3 < 0 || nota3 > 10)) {
            // devolver un error
            System.out.println("Alguna de las notas introducidas no es valida, vuelva a intentarlo.");
            media = -1.0;
        } else {

            if (nota1 >= nota3 && nota2 >= nota3) {
                media = (nota1 + nota2) / 2;
            } else if (nota1 >= nota2 && nota3 >= nota2) {
                media = (nota1 + nota3) / 2;
            } else {
                media = (nota2 + nota3) / 2;
            }

            System.out.println("La media de las notas es: " + media);

        }
        return media;
    }

}
