package TestCalc;

import Calculadora.*;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;

public class Main {
    double numero1 = 5;
    double numero2 = 5;

    @Test
    public void testeAdicao() {
        // Given
        Adicao adicao = new Adicao(numero1, numero2);
        // When
        adicao.calcular();
        adicao.toString();
        //  Then
        Assert.assertTrue(adicao.calcular() == 10);
        Assert.assertFalse(adicao.calcular() == 5);
        Assert.assertNotEquals(20, adicao.calcular());
        Assert.assertThat(adicao.toString(), is("Soma de " + numero1 + " + " + numero2 + " = " + 10.0));
        Assert.assertThat(adicao.toString(), is(not("Soma de " + numero1 + " + " + numero2 + " = " + 30.0)));
    }
    @Test
    public void testeSubtracao() {
        // Given
        Subtracao subtracao = new Subtracao(numero1,numero2);
        // When
        subtracao.calcular();
        subtracao.toString();
        //  Then
        Assert.assertTrue(subtracao.calcular() == 0);
        Assert.assertFalse(subtracao.calcular() == 5);
        Assert.assertNotEquals(20,subtracao.calcular());
        Assert.assertThat(subtracao.toString(),is("Subtração de " + numero1 + " - " + numero2 + " = " + 0.0));
        Assert.assertThat(subtracao.toString(),is(not("Subtração de " + numero1 + " - " + numero2 + " = " + 30.0)));
    }
    @Test
    public void testeDivisao() {
        // Given
        Divisao divisao = new Divisao(numero1,numero2);
        // When
        divisao.calcular();
        divisao.toString();
        //  Then
        Assert.assertTrue(divisao.calcular() == 1);
        Assert.assertFalse(divisao.calcular() == 5);
        Assert.assertNotEquals(20,divisao.calcular());
        Assert.assertThat(divisao.toString(),is("Divisão de  " + numero1 + " / " + numero2 + " = " + 1.0));
        Assert.assertThat(divisao.toString(),is(not("Divisão de " + numero1 + " / " + numero2 + " = " + 30.0)));
    }
    @Test
    public void testeMultiplicacao() {
        // Given
        Multiplicacao multiplicacao = new Multiplicacao(numero1,numero2);
        // When
        multiplicacao.calcular();
        multiplicacao.toString();
        //  Then
        Assert.assertTrue(multiplicacao.calcular() == 25);
        Assert.assertFalse(multiplicacao.calcular() == 5);
        Assert.assertNotEquals(20,multiplicacao.calcular());
        Assert.assertThat(multiplicacao.toString(),is("Multiplicação de " + numero1 + " * " + numero2 + " = " + 25.0));
        Assert.assertThat(multiplicacao.toString(),is(not("Multiplicação de " + numero1 + " * " + numero2 + " = " + 30.0)));
    }
    @Test
    public void testehistorico() {
        // Given
        HistoricoCalc historicoCalc = new HistoricoCalc();
        List<OperaçãoMatematica> operacoes = new ArrayList<>();
        Adicao adicao = new Adicao(numero1,numero2);
        // When
        adicao.calcular();
        historicoCalc.execute(adicao);
        //  Then
        Assert.assertEquals(historicoCalc.getOperacoes().toString(), "[Soma de 5.0 + 5.0 = 10.0]");
        Assert.assertTrue(historicoCalc.getOperacoes() == historicoCalc.getOperacoes());



    }

}
