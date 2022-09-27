package easy;

import javax.swing.*;

public class Exercicio_09_easy {

    public void calculaTabuada (int numeroDigitado) {

        int i = 1, resultado =0;


        // numeroDigitado = Double.parseDouble(JOptionPane.showInputDialog("Informe um número:"));

        while (i <= 10) {
            resultado = numeroDigitado * i;

         System.out.println(numeroDigitado + "x" + i + "=" + resultado);
            i++;

            }
        }
    }