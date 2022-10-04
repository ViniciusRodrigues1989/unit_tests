package easy;

import easy.Exercicio_03_easy;
import org.junit.Assert;
import org.junit.Test;

public class TesteExercicio03_easy {

    @Test
    public void testRetornaValorTrocado(){
        Exercicio_03_easy ex03_easy = new Exercicio_03_easy();
        String msgmEsperada = "O primeiro valor digitado é segundoValor\n" + "O segundo valor digitado é primeiroValor";
        String msgmAtual = ex03_easy.retornaPrimeiroESegundoValor("primeiroValor", "segundoValor");
        Assert.assertEquals("Valor diferente do Esperado", msgmEsperada,msgmAtual);
    }
}
