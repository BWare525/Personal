/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamientopunto;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Represents a collection of points.
 */
public class Conjunto {


    private final ArrayList<Punto> puntos = new ArrayList<>();//CLASE PARAMETRIZADA(EL ARRAYLIST SE LLENARA DE OBJETOS TIPO PUNTO)
    /** //COMO HACE USO DE "FINAL" este deja algo cte/no modificable, pero depende de como se usa deja cte una cosa u otra,
     * en este caso hace que no se pueda crear 
     * otra referencia de la miso parametro
     * Constructs a Conjunto object with the specified number of points.
     * @param n the number of points to create
     */
    public Conjunto(int n) {
        for (int i = 1; i <= n; i++) {
            puntos.add(new Punto("punto " + i));//el metodo .add le pertenece a arraylist y puntos es el atributo tipo arraylist
        }
    }

    /**
     * Returns a string representation of the Conjunto object.
     * @return a string representation of the Conjunto object
     */
    @Override
    public String toString() {
        String a = new String();
        for (Punto x : puntos) {
            a += x.toString() + "\n";
        }
        return a;
    }

    /**
     * Calculates and prints the distance between each pair of points in the conjunto.
     */
    public void distanciaConjunto() {//calcula la distancia de todos los puntos ej:(1,2)(1,3)(1,4)...
        for (int i = 0; i < tamanoConjunto() - 1; i++) {
            for (int j = i + 1; j < tamanoConjunto(); j++) {
                System.out.println(
                        "la distancia entre " + puntos.get(i).toString() + " Y "
                        + puntos.get(j).toString() + " es " +
                        ColorConsola.VERDE.getValor() + 
                        puntos.get(i).distanciaEuclides(puntos.get(j)) + 
                        ColorConsola.NEGRO.getValor() 
                );
            }
        }

    }
    
    /**
     * Returns the string representation of the point at the specified index.
     * @param i the index of the point
     * @return the string representation of the point at the specified index
     */
    public String puntoAt(int i){
        if(i >=0 && i < tamanoConjunto()){
            return this.puntos.get(i).toString();
        }
        else{
            JOptionPane.showMessageDialog(null, "La posición se encuentra fuera del rango válido", "Error en la entrada", JOptionPane.ERROR_MESSAGE);
        }
       return null;
    }

    /**
     * Removes the point at the specified index.
     * @param i the index of the point to remove
     * @return the string representation of the removed point
     */
    public String removeAt(int i){
        if(i >=0 && i < tamanoConjunto()){
            this.puntos.remove(i);
        }
        else{
            JOptionPane.showMessageDialog(null, "La posición se encuentra fuera del rango válido", "Error en la entrada", JOptionPane.ERROR_MESSAGE);
        }
       return null;
    }
     
     /**
      * Adds a new point to the conjunto.
      * @param nuevo the new point to add
      */
     public void addPunto(Punto nuevo){
         this.puntos.add(nuevo);
     }
     
     /**
      * Returns the size of the conjunto.
      * @return the size of the conjunto
      */
    public int tamanoConjunto(){
         return this.puntos.size();
     }
     
    /* 
     // Esta acción no esta permitida por el modificador final del arrayList
     public void removePuntos(){
      this.puntos =  new ArrayList<>();
     }
   */
}
