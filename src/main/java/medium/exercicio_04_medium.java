package medium;

public class exercicio_04_medium {
    public void multiplicaNumerosAteMil() {
        int i = 1, resultadoMultiplicacao = 1;

        while (i <= 1000) {
            resultadoMultiplicacao = resultadoMultiplicacao * i;
            System.out.println("O resultado da multiplicação é: " + resultadoMultiplicacao);
            if (resultadoMultiplicacao >= 1000) {
                resultadoMultiplicacao = 1;
                System.out.println("O resultado voltou a ser: " + resultadoMultiplicacao);
            }
            i++;
        }

    }
}


    /*

    static int i = 1, multiplicacao = 1;

    public static void main(String[] args) {

        while (i <= 1000) {
            multiplicacao = multiplicacao * i;
            System.out.println(multiplicacao);

            if (multiplicacao >= 1000) {
                multiplicacao = 1;
                System.out.println(multiplicacao);
            }
            i++;
        }
    }
}
*/