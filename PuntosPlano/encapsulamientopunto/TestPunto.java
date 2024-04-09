package encapsulamientopunto;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author Roberto A. Pava
 */
public class TestPunto {

    /**
     * The main method is the entry point of the program.
     * It prompts the user for input, creates a Conjunto object, and performs various operations on it.
     * 
     * @param args The command-line arguments passed to the program.
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.print("\nIngrese el nombre: ");
        String nombre = leer.nextLine();
        System.out.println("\nHola " + nombre);
        leer.close();//cierra el buffer parta los valores del teclado
    
        System.out.println(ColorConsola.AZUL.getValor() + "Inicio de ejecución del programa.");
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de puntos:", "PUNTOS....", JOptionPane.INFORMATION_MESSAGE));
        Conjunto c = new Conjunto(n);
        System.out.println(c.toString());
        System.out.println("Cantidad de Puntos: " + c.tamanoConjunto());
        c.distanciaConjunto();
        System.out.println("\nPunto en la posición 1 del array: " + c.puntoAt(1));
        System.out.println("Eliminando punto Posición 1:");
        c.removeAt(1);
        System.out.println("Cantidad de Puntos: " + c.tamanoConjunto());
        System.out.println(c.toString());
        c.distanciaConjunto();
        System.out.println("\nPunto en la posición 1 del array: " + c.puntoAt(1));
        System.out.println("Eliminando punto Posición 1:");
        c.removeAt(1);
        System.out.println("Cantidad de Puntos: " + c.tamanoConjunto());
        System.out.println(c.toString());
        c.distanciaConjunto();

        for(int i=n+1; i<n+5; i++){
            c.addPunto(new Punto("punto " + i));
        }
        
        System.out.println(c.toString());
        System.out.println("Cantidad de Puntos: " + c.tamanoConjunto());
    }
}
