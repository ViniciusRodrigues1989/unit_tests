package easy;

import javax.swing.*;

public class Exercicio_10_1_easy {



    public double calculaJuros(double valorInvestimento) {
        int ano = 1;
        double valorJuros = 0, taxaJuros = (0.05);

        //  valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor para investimento:"));

        while (ano <= 10) {
            valorJuros = valorJuros + (valorInvestimento * taxaJuros);
            ano++;
        }
        return valorJuros;
    }
        public double totalComJuros(double valorJuros, double valorInvestimento){
            double valorTotal = valorJuros + valorInvestimento;
        return valorTotal;
        }

        //System.out.println("O valor investido é de R$:" + valorInvestimento + " \n o valor dos juros em 10 anos é "+ano+" de R$:" + valorJuros + "\n o valor total com juros será de R$:" + valorTotal);
    }

