package easy;

import javax.swing.*;
import java.text.DecimalFormat;

public class execucao_exerc_easy {

   // static Exercicio_02_easy exer02Easy;

    public static void main(String[] args){

        int selecionaExercicio;
        selecionaExercicio = Integer.parseInt(JOptionPane.showInputDialog("Informe o exercicio a ser executado"));

        if(selecionaExercicio == 2){
            Exercicio_02_easy ex02_easy = new Exercicio_02_easy();
            //  String palavra = ex02_easy.retornaPalavra(("Vinicius Rodrigues")); OU
            String palavra = ex02_easy.retornaPalavra(JOptionPane.showInputDialog("Digite uma Palavra"));
            System.out.println(palavra);
        }

        if(selecionaExercicio == 3) {
            Exercicio_03_easy ex03_easy = new Exercicio_03_easy();
            String primeiroValor = "30";
            String segundoValor = "50";
            System.out.println(ex03_easy.retornaPrimeiroESegundoValor(primeiroValor,segundoValor));

        }
        if(selecionaExercicio == 4) {
            Exercicio_04_easy ex04_easy = new Exercicio_04_easy();
            int numeroDigitado = 12;   //Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
            //      int dobroCalculado = ex04_easy.retornaDobroNumero(numeroDigitado);
            // System.out.println("O dobro de" + numeroDigitado + "é: " + dobroCalculado - é a perfumaria de :ex04_easy.retornaDobroNumero(numeroDigitado));
            System.out.println("O dobro de " + numeroDigitado + " é: " + ex04_easy.retornaDobroNumero(numeroDigitado));

        }

        if(selecionaExercicio == 5 ){
            Exercicio_05_easy ex05_easy = new Exercicio_05_easy();
            int valor1 = 20;
            int valor2 = 15;
            int valor3 = 35;

            int soma = ex05_easy.somaResultado(valor1,valor2,valor3);
                    int subt = ex05_easy.subtResultado(valor1,valor2,valor3);
                            int mult = ex05_easy.multResultado(valor1,valor2,valor3);
                                    int media = ex05_easy.mediaResultado(soma);

            System.out.println("A soma dos valores é " + soma);
            System.out.println("A subtração dos valores é " + subt);
            System.out.println("A multiplicação dos valores é " + mult);
            System.out.println("A media dos valores é " + media);
        }

        if(selecionaExercicio == 6 ){
            Exercicio_06_easy ex06_easy = new Exercicio_06_easy();
        double primeiraNota = 4;
        double segundaNota = 4;
        System.out.println(ex06_easy.varificaAprovacao(primeiraNota,segundaNota));
        }

        if(selecionaExercicio == 7 ){
            Exercicio_07_easy ex07_easy = new Exercicio_07_easy();
            double salario = 1044;
            double calculoInss = ex07_easy.calculaInss(salario);
            System.out.println("O valor a ser pago de INSS é de R$: " +calculoInss);
        }

        if (selecionaExercicio == 8 ){
        Exercicio_08_easy ex08_easy = new Exercicio_08_easy();
        double salario = 3000.00;
        double impostoRenda = ex08_easy.calculaImpostoRenda(salario);
        double salarioLiquido = ex08_easy.calculaSalarioLiquido(salario,impostoRenda);
               System.out.println("O valor do Imposto de renda é R$" + impostoRenda);
            System.out.println("O valor do Salário liquido é de R$" + salarioLiquido );
        }
        if (selecionaExercicio == 9){
        int numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero de 1 a 10:"));
            Exercicio_09_easy ex09_easy = new Exercicio_09_easy();
            ex09_easy.calculaTabuada(numeroDigitado);
        }

        if (selecionaExercicio == 10){
            double valorInvestimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor investido: "));
            DecimalFormat df = new DecimalFormat("##,###.##");
            Exercicio_10_1_easy ex10_easy = new Exercicio_10_1_easy();
            double valorJuros = ex10_easy.calculaJuros(valorInvestimento);
            String valorTotal = df.format(ex10_easy.totalComJuros(valorJuros, valorInvestimento));
            System.out.println("Valor investido: R$" + valorInvestimento + "\n" + "Valor juros: " + df.format(valorJuros));
            System.out.println("Valor total com juros: R$" + valorTotal);
            }
        if (selecionaExercicio == 11){
            int numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
            Exercicio_11_easy ex11_easy = new Exercicio_11_easy();
            System.out.println("O total somado é: " + ex11_easy.somaAlgoritmo(numeroDigitado));
        }
        else {
            System.out.println("Esse exercicio ainda não existe");

            
            }
        }
    }

