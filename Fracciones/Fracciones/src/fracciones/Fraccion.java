package fracciones;

public class Fraccion {
    
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        setNumerador(numerador);
        this.denominador=1;
        setDenominador(denominador);
    } 
    
    public Fraccion(){//cuando no se ingresan datos la fraccion por deefcto será:
        setNumerador(0);
        setDenominador(1);
    }
    public Fraccion(int numerador){//para un constructor con un solo ingreso de dato debe tener diferente tipo de dato (encaje de parametros)
        setNumerador(numerador);
        setDenominador(1);
    }

    public int getNumerador() {
        return numerador;
    }

    private void setNumerador(int numerador) {
//la unica q puede modificar los atributos es la misma clase (porque la clase es private)
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    private void setDenominador(int denominador) {
        if(denominador!=0){
        this.denominador = denominador;}
        else{
            System.out.println("El denominador debe der diferente de 0");}
    }
    
    public static Fraccion Multiplicar(Fraccion a, Fraccion b){//metodo de clase
        return new Fraccion(a.getNumerador()*b.getNumerador(),a.getDenominador()*b.getDenominador());   
    }
    
    public Fraccion Dividir (Fraccion b){ //metodo de instancia 
        int a=numerador*b.getDenominador();
        int c=denominador*b.getNumerador();
        
        return new Fraccion(a,c);
    }

    @Override
    public String toString() {
        return "{" + numerador + "/"+ denominador + "}";
    }  
    public double toDouble(){//metodo se usa para transformar la forma numerador/denominador a decimal
        return (double)getNumerador()/getDenominador();
    }
}
