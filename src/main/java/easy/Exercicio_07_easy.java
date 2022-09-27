package easy;

public class Exercicio_07_easy {


    public double calculaInss(double salario) {
        double inss = 0;


       // salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o Salário para calculos:"));

        if(salario <= 1045.00){
          inss = salario * 0.075;
        }

        if(salario >= 1045.01 && salario <= 2089.60){
        inss = salario * 0.09;
        }

       if(salario >= 2089.61 && salario<= 3134.40) {
           inss = salario * 0.12;
       }

       if(salario >= 3134.41 && salario <= 6101.06) {
           inss = salario * 0.14;
       }

     if (salario >=6101.07) {
         inss = salario * 0.14;
     }
    return inss;
      //  {System.out.println("O valor do INSS é:" + inss);}
    }
}

//Inicio do Algoritmo

  //      Declarar variável do tipo numerico: salario, inss;
    //    salario = Ler(7000,00)

      //  SE (salario <= 1.045)
        //inss  = salario * 0,075;
       // FIM SE

       // SE (salario >= 1.045,01 && <= 2.089,60)
       // inss = salario * 0,09;
       // FIM SE

        //SE (salario >= 2.089,61 && <= 3.134,40)
        //inss = salario * 0,12;
        //FIM SE

        //SE (salario >= 3.134,41 && <= 6.101,06)
        //inss = salario * 0,14;
       // FIM SE

        //SE NAO
        //inss = salario * 0,14;

       // Exibir: “ O valor a ser pago de INSS é” + inss
