import easy.Exercicio_04_easy;
import org.junit.Assert;
import org.junit.Test;

public class TesteExercicio04_easy {

    @Test
public void testCalculaDobro(){
Exercicio_04_easy ex04_easy = new Exercicio_04_easy();
int valorEsperado = 10;
//int valorEsperado = 9; para dar erro.
int valorAtual = ex04_easy.retornaDobroNumero(5);

Assert.assertEquals("Valor esperado diferente do Atual",valorEsperado,valorAtual);

    }
}