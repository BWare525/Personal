package encapsulamientopunto;

import java.util.Random;

/**
 *
 * @author Roberto A. Pava
 */

/**
 * The Punto class represents a point in a two-dimensional space.
 * It encapsulates the x and y coordinates of the point, as well as an optional label.
 */
public class Punto {

    private int x;
    private int y;
    private String etiqueta;

    // Constructors

    /**
     * Constructs a Punto object with the specified coordinates and label.
     * @param a the x-coordinate of the point
     * @param b the y-coordinate of the point
     * @param c the label of the point
     */
    public Punto(int a, int b, String c) {
        setX(a);
        setY(b);
        setEtiqueta(c);
    }

    /**
     * Constructs a Punto object with the default coordinates (0, 0) and label "origen".
     */
    public Punto() {
        this(0, 0, "origen");//este this está llamando constructores, depende la cantidad de ingresos el constractor que vaya a usar//
    }

    /**
     * Constructs a Punto object with random coordinates and the specified label.
     * The coordinates are generated using a random number generator.
     * @param etiqueta the label of the point
     */
    public Punto(String etiqueta) {
        Random r = new Random(System.nanoTime());//toma el tiempo en nanosegundos para generar un numero "aleatorio"//
        setX(r.nextInt(10000));//el 10k es el limite del plano//
        setY(r.nextInt(10000));
        setEtiqueta(etiqueta);
        r.setSeed(System.nanoTime());
    }

    // Methods

    /**
     * Sets the x-coordinate of the point.
     * @param a the new x-coordinate
     */
    public final void setX(int a) {
        this.x = a;
    }

    /**
     * Sets the y-coordinate of the point.
     * @param a the new y-coordinate
     */
    public final void setY(int a) {
        y = a;
    }

    /**
     * Sets the label of the point.
     * @param a the new label
     */
    public final void setEtiqueta(String a) {//se usa final para no ser reescrito
        etiqueta = a;
    }

    /**
     * Returns the x-coordinate of the point.
     * @return the x-coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * Returns the y-coordinate of the point.
     * @return the y-coordinate
     */
    public int getY() {
        return y;
    }

    /**
     * Returns the label of the point.
     * @return the label
     */
    public String GetEtiqueta() {
        return etiqueta;
    }

    /**
     * Calculates and returns the Euclidean distance between this point and another point.
     * @param p2 the other point
     * @return the Euclidean distance
     */
    public double distanciaEuclides(Punto p2) {//se recibe como parametro el punto al cual queremos calcular la distancia
        return (Math.sqrt((getX() - p2.getX()) * ((getX() - p2.getX()))//formula de la distancia de euclides(raiz de la suma de las diferencias al cuadrado de las coordenadas(X0-X,Y0-Y))
                + (getY() - p2.getY()) * (getY() - p2.getY())));
    }

    /**
     * Returns a string representation of the point.
     * The string includes the label and the coordinates of the point.
     * @return a string representation of the point
     */
    @Override
    public String toString() {/*ColorConsola.ROJO.getValor() me imprime los valores que estaban en el enum, en el primer caso (ROJO) "\u001B[31m"     */ 
        return ColorConsola.ROJO.getValor()+ 
               GetEtiqueta() + 
               ColorConsola.NEGRO.getValor() + 
               ColorConsola.AZUL.getValor() + 
               " [" + 
               ColorConsola.NEGRO.getValor() + 
               getX() + 
               ColorConsola.ROJO.getValor() + 
               ","  +
               ColorConsola.NEGRO.getValor() + 
               getY() + 
               ColorConsola.AZUL.getValor() + 
               "]" + 
               ColorConsola.NEGRO.getValor();
    }

    /**
     * Translates the point along the x-axis by the specified amount.
     * @param x the amount to translate along the x-axis
     */
    public void trasladarX(int x) {//+= hace q se sumen los nuevos valores
        this.x += x;
    }

    /**
     * Translates the point along the y-axis by the specified amount.
     * @param y the amount to translate along the y-axis
     */
    public void trasladarY(int y) {
        this.y += y;
    }

    /**
     * Translates the point by the specified amounts along the x-axis and y-axis.
     * @param x the amount to translate along the x-axis
     * @param y the amount to translate along the y-axis
     */
    public void trasladar(int x, int y) {//este modifica los dos, recibe 2 parametros nuevos 
        trasladarX(x);
        trasladarY(y);
    }
}
