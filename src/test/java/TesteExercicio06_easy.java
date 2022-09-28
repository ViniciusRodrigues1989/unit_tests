import easy.Exercicio_06_easy;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TesteExercicio06_easy {

    static Exercicio_06_easy ex06_easy;

  @BeforeClass

    public static void beforeClass(){ ex06_easy = new Exercicio_06_easy();}

    @Test

    public void testVarificaAprovado(){
      String msgmEsperada = "O aluno está APROVADO";
      String msgmAtual = ex06_easy.verificaAprovacao(6,6);

        Assert.assertEquals("O valor atual é diferente do esperado",msgmEsperada,msgmAtual);

    }

    @Test

    public void testVerificaExame(){
    String msgmEsperada = "O aluno está de EXAME";
    String msgmAtual = ex06_easy.verificaAprovacao(5,5);

      Assert.assertEquals("O valor atual é diferente do esperado",msgmEsperada,msgmAtual);
  }

  @Test
  public void testVerificaReprovado(){
    String msgmEsperada = "O aluno está REPROVADO";
    String msgmAtual = ex06_easy.verificaAprovacao(3,3);

    Assert.assertEquals("O valor atual é diferente do esperado",msgmEsperada,msgmAtual);
  }
}
