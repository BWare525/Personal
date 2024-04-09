/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package encapsulamientopunto;

/**
 * This enum represents the colors that can be used in console output.//enum es la forma de organizar datos
 * Each color is defined by its ANSI escape code.
 */
enum ColorConsola {
    // valores definidos por la ANSI
    ROJO ("\u001B[31m"),//colores estandar definidos por la ansi 
    VERDE ("\033[32m"),
    NEGRO ("\033[30m"),
    AZUL ("\033[034m");

    private final String color;
    
    /**
     * Constructs a new ColorConsola object with the specified color.
     * @param color the ANSI escape code representing the color
     */
    ColorConsola (String color){
        this.color = color;
    }

    /**
     * Returns the ANSI escape code representing the color.
     * @return the ANSI escape code representing the color
     */
    public String getValor() {
        return color;
    }
}
