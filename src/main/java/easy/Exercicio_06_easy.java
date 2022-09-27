package easy;

import javax.swing.*;

public class Exercicio_06_easy {
    public String varificaAprovacao(double primeiraNota,double segundaNota) {
        double mediaNotas;
        mediaNotas = (primeiraNota + segundaNota) / 2;

        if (mediaNotas > 5) {
            return ("O aluno está APROVADO");
        }

        if (mediaNotas < 5) {
            return ("O aluno está REPROVADO");
        }

        if (mediaNotas == 5) {
            return ("O aluno está de EXAME");
        }

        return null;
    }
}



//Inicio do algoritmo

  //      Declarar variável do tipo inteiro: primeiraNota, segundaNota, mediaNotas;
    //    primeiraNota = Ler(4);
      //  segundaNota = Ler(5);
        //mediaNotas = (primeiraNota+segundaNota) / 2;
        //SE (mediaNotas > 5)
        //Ler: "Aprovado!";
        //FIM SE
        //SE (mediaNotas < 5)
        //Ler: "Reprovado!";
        //FIM SE
        //SE NÃO (mediaNotas = 5)
        //Ler: "Ficou para exame!";

        //Fim do algoritmo
