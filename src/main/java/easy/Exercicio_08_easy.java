package easy;

import javax.swing.*;

public class Exercicio_08_easy {

    public double calculaImpostoRenda(double salario) {
        double impostoRenda = 0;

        // salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o Salário para calculo:"));

        if (salario > 0 && salario <= 1903.98) {
            impostoRenda = 0;
        }


        if (salario >= 1903.99 && salario <= 2826.65) {
            impostoRenda = (salario * 0.075) - 142.79;
        }


        if (salario >= 2826.66 && salario <= 3751.05) {
            impostoRenda = (salario * 0.15) - 354.80;
        }

        if (salario >= 3751.06 && salario <= 4664.68) {
            impostoRenda = (salario * 0.225) - 636.13;
        }

        if (salario >= 4664.69) {
            impostoRenda = (salario * 0.275) - 869.36;
        }
        return impostoRenda;
    }

        public double calculaSalarioLiquido(double salario, double impostoRenda){
           return  salario - impostoRenda;

             }

        }


// System.out.println("Seu Salário BRUTO será de R$:" + salario + " \n O Salário Liquido será de:" + salarioLiquido + "\n O valor devido de Imposto de Renda será de:" + impostoRenda);


