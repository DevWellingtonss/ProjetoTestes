package Calculadora;

import org.junit.Ignore;

import java.util.Scanner;
@Ignore
public class MainCalc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HistoricoCalc historicoCalc = new HistoricoCalc();
        int operador;
        double numero1, numero2;

        do {
        System.out.println("CALCULADORA: Digite algum dos numeros abaixo para iniciar uma operação, visualizar historico ou sair.");
        System.out.println("1 para Adição");
        System.out.println("2 para Subtração");
        System.out.println("3 para Multiplicação");
        System.out.println("4 para Divisão");
        System.out.println("5 para Historico");
        System.out.println("6 para Sair");

            operador = sc.nextInt();

            if (operador == 1) {
                System.out.println("Digite o primeiro numero para realizar a soma");
                numero1 = sc.nextDouble();
                System.out.println("Digite o segundo numero para realizar a soma");
                numero2 = sc.nextDouble();
                Adicao adicao = new Adicao(numero1, numero2);
                System.out.printf("O resultado soma de %.1f + %.1f é = %.1f  \n",numero1, numero2, historicoCalc.execute(adicao));

            } else if (operador == 2) {
                System.out.println("Digite o primeiro numero para realizar a subtração");
                numero1 = sc.nextDouble();
                System.out.println("Digite o segundo numero para realizar a subtração");
                numero2 = sc.nextDouble();
                Subtracao subtrair = new Subtracao(numero1, numero2);
                System.out.printf("O resultado da subtração de %.1f - %.1f é = %.1f  \n",numero1, numero2, historicoCalc.execute(subtrair));

            } else if (operador == 3) {
                System.out.println("Digite o primeiro numero para realizar a multiplicação");
                numero1 = sc.nextDouble();
                System.out.println("Digite o segundo numero para realizar a multiplicação");
                numero2 = sc.nextDouble();
                Multiplicacao multiplicar = new Multiplicacao(numero1, numero2);
                System.out.printf("O resultado da multiplicação de %.1f * %.1f é = %.1f  \n",numero1, numero2, historicoCalc.execute(multiplicar));

            } else if (operador == 4) {
                System.out.println("Digite o primeiro numero para realizar a divisão");
                numero1 = sc.nextDouble();
                System.out.println("Digite o segundo numero para realizar a divisão");
                numero2 = sc.nextDouble();
                Divisao dividir = new Divisao(numero1, numero2);
                System.out.printf("O resultado da divisão de %.1f / %.1f é = %.1f  \n",numero1, numero2, historicoCalc.execute(dividir));

            } else if (operador == 5) {
                for (OperaçãoMatematica operaçãoMatematica : historicoCalc.getOperacoes()){
                    System.out.println(operaçãoMatematica);
                }
            } else if (operador == 6) {
                System.out.println("Saindo....");
                System.exit(0);

            }else if (operador > 6) {
                System.out.println("Opção não é valida");
            }
        } while (operador != 6);
    }
}

