package domain;

public class Calculadora {

    private double num1;
    private double num2;
    
    //Calculadora Java
    public Calculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public String sumar() {
       return "El valor de la suma es: " + (num1+num2);
    }

    public void restar() {
        System.out.println("El valor de la resta es: " + (num1-num2));
    }

    public String multiplicar() {
        return "El valor de la multiplicación es: " + num1*num2;
    }

    public void dividir() {
        System.out.println("El valor de la división es: " + num1/num2);
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

}
