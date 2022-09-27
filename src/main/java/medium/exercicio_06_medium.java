package medium;

public class exercicio_06_medium {

    public int calculaFatorial(int fatorial) {
        int i;

        i = fatorial;

        while(i>1){
            fatorial = fatorial * (i-1);
            i--;
        }
        return fatorial;
    }
}
/*
    static int fatorial,i;

    public static void main (String[]args){
        fatorial = 10;
                i = fatorial;
                while (i >1) {
                    fatorial =fatorial*(i-1);
                    i--;
                    }

        System.out.println("O fatorial do numero digitado é:" + fatorial);
    }
}
*/