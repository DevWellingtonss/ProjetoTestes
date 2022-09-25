package Calculadora;

import java.util.ArrayList;
import java.util.List;

public class HistoricoCalc{
    private List<OperaçãoMatematica> operacoes = new ArrayList<>();

    public List<OperaçãoMatematica> getOperacoes(){ return operacoes;
    }
    public double execute(OperaçãoMatematica operacao){
        operacoes.add(operacao);
        return operacao.calcular();
    }
}
