package medium;

import javax.swing.*;
import java.util.StringJoiner;

public class exercicio_09_medium {
    public static void main(String[] args) {

        int i = 0;
        String nomeAlunoVetor[] = new String[5];
        int numeroAlunoVetor[] = new int[5];

        while (i < 5) {
            nomeAlunoVetor[i] = JOptionPane.showInputDialog("Digite o nome do aluno:");
            numeroAlunoVetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do Aluno:"));
            i++;
        }
        i = 0;
        while (i < 5) {
            System.out.println("Nome do aluno:" + nomeAlunoVetor[i] + "- Numero do Aluno:" + numeroAlunoVetor[i]);
            i++;
        }
    }
}
