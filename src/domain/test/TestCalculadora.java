package domain.test;
import domain.Calculadora;

public class TestCalculadora {
    
    public static void main(String[] args) {
        
        Calculadora calculadora1 = new Calculadora(10, 4);
        System.out.println("CALCULADORA");
        System.out.println("Los numeros a operar son los siguiente: " + calculadora1.getNum1() + " y " + calculadora1.getNum2());
        System.out.println(calculadora1.sumar());
        calculadora1.restar();
        System.out.println(calculadora1.multiplicar());
        calculadora1.dividir();
        
        calculadora1.setNum2(10);
        System.out.println();
        System.out.println("Nueva suma con valor 2 modificado");
        System.out.println(calculadora1.sumar());
        
    }
    
}
