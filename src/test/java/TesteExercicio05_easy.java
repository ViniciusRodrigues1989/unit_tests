import easy.Exercicio_05_easy;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TesteExercicio05_easy {
    static Exercicio_05_easy ex05_easy;

    @BeforeClass
    public static void beforeClass() {
        ex05_easy = new Exercicio_05_easy();
    }
    @Test
    public void testCalculaSoma() {
        int valorEsperado = 15;
        int valorAtual = ex05_easy.somaResultado(5, 5, 5);

        Assert.assertEquals("O valor da soma é diferente do atual", valorEsperado, valorAtual);
    }

    @Test
public void testCalculaSubt(){
    int valorEsperado =10 ;
            int valorAtual = ex05_easy.subtResultado(15,3,2);

            Assert.assertEquals("O valor da subtração é diferente do atual", valorEsperado,valorAtual);
    }

    @Test
    public void testCalculaMultp(){
        int valorEsperado = 48;
                int valorAtual = ex05_easy.multResultado(8,2,3);

        Assert.assertEquals("O valor da multiplicação é diferente do atual",valorEsperado,valorAtual);
    }

    @Test
    public void testCalculaMedia(){
    int soma = ex05_easy.somaResultado(10,5,3);
    int valorAtual = ex05_easy.mediaResultado(soma);
    int valorEsperado = 6;

        Assert.assertEquals("O valor da multiplicação é diferente do atual",valorEsperado,valorAtual);

    }
}