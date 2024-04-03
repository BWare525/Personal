package fracciones;

public class Fracciones {
       
    public static void main(String[] args) {
        Fraccion a = new Fraccion(2,5);
        Fraccion b = new Fraccion(3,6);
        Fraccion multiplicacion = Fraccion.Multiplicar(a, b);
        System.out.println(multiplicacion.toString()+" Su forma decimal: "+multiplicacion.toDouble());
        Fraccion division=a.Dividir(b);
        System.out.println(division.toString()+" Su forma decimal: "+division.toDouble());    
    }
    
}
