 package medium;

import javax.swing.*;

public class exercicio_01_medium {

public void exibeParOuImpar(int valorInformado) {

    while (valorInformado <= 100) {
        if (valorInformado % 2 == 0) {
            System.out.println("Este numero:" + valorInformado + " é PAR");
        } else {
            System.out.println("Este numero:" + valorInformado + " é IMPAR");
        }
        valorInformado++;
    }
}
}
/*
    public int informaParOuImpar(int valorInformado) {
        int i = 0;

                         if (i % 2 == 0) {
                    System.out.println("O numero " + i + " é par");
                }
                else {
                    System.out.println("O numero " + i + " é impar");
                }
                i++;
            }
        }
    }
*/