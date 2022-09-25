package Calculadora;

import Calculadora.OperaçãoMatematica;

public class Subtracao implements OperaçãoMatematica {
    private final double numero1;
    private final double numero2;

    public Subtracao(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    @Override
    public String toString (){
        return "Subtração de " + numero1 + " - " + numero2 + " = " + calcular();
    }
    @Override
    public double calcular() {
        return numero1 - numero2;
    }
}