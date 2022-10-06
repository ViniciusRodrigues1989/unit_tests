package medium;

public class exercicio_10_while_medium {


        public long[] calculaTermoFibonacci(int elemento) {

            int i = 2;
            long fibonacci[] = new long[elemento];
            fibonacci[0] = 0;
            fibonacci[1] = 1;

            while (i < elemento) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
                i++;
            }

            return fibonacci;
        }

        public void imprimeVetor(long[] vetor) {
            int i = 0;
            while (i < vetor.length) {
                System.out.println("Termo: " + (i + 1) + ", valor: " + vetor[i]);
                i++;
            }
        }
    }