package easy;

import easy.Exercicio_07_easy;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.text.DecimalFormat;

public class TesteExercicio07_easy {
    static DecimalFormat formating;

    static Exercicio_07_easy ex07_easy;

    @BeforeClass
    public static void beforeClass() {
        ex07_easy = new Exercicio_07_easy();
        formating = new DecimalFormat("#,###.00");

    }

    @Test
    public void testInssPrimeiraFaixa() {
        String valorEsperado = "78,38";
        String valorAtual = formating.format(ex07_easy.calculaInss(1045.00));

        Assert.assertEquals("O valor atual é diferente do esperado", valorEsperado, valorAtual);
    }

    @Test
    public void testInssSegundaFaixa() {
        String valorEsperado = "94,05";
        String valorAtual = formating.format(ex07_easy.calculaInss(1045.01));

        Assert.assertEquals("O valor atual é diferente do esperado", valorEsperado, valorAtual);
    }

    @Test
    public void testInssSegundaFaixaFinal() {
        String valorEsperado = "188,06";
        String valorAtual = formating.format(ex07_easy.calculaInss(2089.60));

        Assert.assertEquals("O valor atual é diferente do esperado", valorEsperado, valorAtual);
    }

    @Test
    public void testInssTerceiraFaixa() {
        String valorEsperado = "250,75";
        String valorAtual = formating.format(ex07_easy.calculaInss(2089.61));

        Assert.assertEquals("O valor atual é diferente do esperado", valorEsperado, valorAtual);
    }

    @Test
    public void testInssTerceiraFaixaFinal() {
        String valorEsperado = "376,13";
        String valorAtual = formating.format(ex07_easy.calculaInss(3134.40));

        Assert.assertEquals("O valor atual é diferente do esperado", valorEsperado, valorAtual);
    }

    @Test
    public void testInssQuartaFaixa() {
        String valorEsperado = "438,82";
        String valorAtual = formating.format(ex07_easy.calculaInss(3134.41));

        Assert.assertEquals("O valor atual é diferente do esperado", valorEsperado, valorAtual);
    }

    @Test
    public void testInssQuartaFaixaFinal() {
        String valorEsperado = "854,15";
        String valorAtual = formating.format(ex07_easy.calculaInss(6101.06));

        Assert.assertEquals("O valor atual é diferente do esperado", valorEsperado, valorAtual);
    }

    @Test
    public void testInssUltimaFaixa() {
        String valorEsperado = "854,15";
        String valorAtual = formating.format(ex07_easy.calculaInss(6101.07));

        Assert.assertEquals("O valor atual é diferente do esperado", valorEsperado, valorAtual);
    }
}
