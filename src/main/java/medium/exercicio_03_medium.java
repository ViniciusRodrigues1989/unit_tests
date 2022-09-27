package medium;

public class exercicio_03_medium {
    public void somarNumerosAcumulados() {
        int i = 0 , soma = 0;
        while (i<1000){ //Inicio enquanto
            soma = soma+i;
            System.out.println(soma);
            i++;
            if (soma >= 1500){ //Inicio SE
                break;
            }//Fim SE
        }//Fim enquanto

    }
}


    /*
    static int i = 0, soma;

    public static void main(String[] args) {

        while (i <= 1000) {
            soma = soma + i;
            System.out.println(soma);
            i++;
            if (soma >= 1500) {
                break;
            }
        }
    }
}
     */