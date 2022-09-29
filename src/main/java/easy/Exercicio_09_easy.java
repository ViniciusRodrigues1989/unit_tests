package easy;

public class Exercicio_09_easy {

    public int calculaTabuada (int numeroDigitado) {

        int i = 1, resultado =0;


        // numeroDigitado = Double.parseDouble(JOptionPane.showInputDialog("Informe um número:"));

        while (i <= 10) {
            resultado = numeroDigitado * i;

         System.out.println(numeroDigitado + "x" + i + "=" + resultado);
            i++;

            }
        return i;
    }
    }