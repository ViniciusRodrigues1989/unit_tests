import easy.Exercicio_07_easy;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TesteExercicio07_easy {

static Exercicio_07_easy ex07_easy;

@BeforeClass

    public static void beforeClass(){ ex07_easy = new Exercicio_07_easy();}

    @Test

    public void testInssPrimeiraCondicao(){
    double valorEsperado = 0;
        double salario = 900.00;
        double valorAtual = ex07_easy.calculaInss(salario);

        Assert.assertEquals("O valor atual é diferente do esperado",valorEsperado,valorAtual);
    }

    @Test

    public void testInssSegundaCondicao(){
        double valorEsperado = 82.50;
        double salario = 1100.00;
        double valorAtual = ex07_easy.calculaInss(salario);

        Assert.assertEquals("O valor atual é diferente do esperado",valorEsperado,valorAtual);
    }
    @Test
    public void testInssTerceiraCondicao(){
        double valorEsperado = 153.00;
        double salario = 1700.00;
        double valorAtual = ex07_easy.calculaInss(salario);

        Assert.assertEquals("O valor atual é diferente do esperado",valorEsperado,valorAtual);
    }
    @Test
    public void testInssQuartaCondicao(){
        double valorEsperado = 324.00;
        double salario = 2700.00;
        double valorAtual = ex07_easy.calculaInss(salario);

        Assert.assertEquals("O valor atual é diferente do esperado",valorEsperado,valorAtual);
    }
    @Test
    public void testInssQuintaCondicao(){
        double valorEsperado = 728.00;
        double salario = 5200.00;
        double valorAtual = ex07_easy.calculaInss(salario);

        Assert.assertEquals("O valor atual é diferente do esperado",valorEsperado,valorAtual);
    }
    @Test
    public void testInssSextaCondicao() {
        double valorEsperado = 1120.00;
        double salario = 8000.00;
        double valorAtual = ex07_easy.calculaInss(salario);

        Assert.assertEquals("O valor atual é diferente do esperado", valorEsperado, valorAtual);
    }
}
