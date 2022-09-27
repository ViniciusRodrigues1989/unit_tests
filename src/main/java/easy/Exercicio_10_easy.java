package easy;

import javax.swing.*;

public class Exercicio_10_easy {
    public static void main(String[] args) {
        double valorJuros, taxaJuros=(0.05), valorInvestimento, valorTotal;

        valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor para investimento:"));

        valorJuros = (10 * taxaJuros) * valorInvestimento;
                valorTotal = valorJuros + valorInvestimento;

        System.out.println("O valor investido é de R$:" + valorInvestimento + " \n o valor dos juros em 10 anos é de R$:" + valorJuros + "\n o valor total com juros será de R$:" + valorTotal);
    }
    }
