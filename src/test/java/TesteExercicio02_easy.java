import easy.Exercicio_02_easy;
import org.junit.Assert;
import org.junit.Test;

public class TesteExercicio02_easy {
    @Test

    public void testRetornaPalavra(){
        Exercicio_02_easy ex02_easy = new Exercicio_02_easy();
        String msgEsperada = "O usuário digitou:Teste";
        String msgAtual = ex02_easy.retornaPalavra("Teste");

        Assert.assertEquals("O valor esperado, é diferente do real",msgEsperada,msgAtual);
    }
}