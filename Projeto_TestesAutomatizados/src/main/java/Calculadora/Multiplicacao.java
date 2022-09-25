package Calculadora;

public class Multiplicacao implements OperaçãoMatematica {

    private final double numero1;
    private final double numero2;

    public Multiplicacao(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    @Override
    public String toString (){
        return "Multiplicação de " + numero1 + " * " + numero2 + " = " + calcular();
    }
    @Override
    public double calcular() {
        return numero1 * numero2;
    }
}