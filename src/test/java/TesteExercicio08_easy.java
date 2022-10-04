import easy.Exercicio_08_easy;
import easy.Exercicio_08_easy;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.text.DecimalFormat;

public class TesteExercicio08_easy {
    static DecimalFormat formating;
    static Exercicio_08_easy ex08_easy;

    @BeforeClass
    public static void beforeClass() {
        ex08_easy = new Exercicio_08_easy();
        formating = new DecimalFormat("#,###.00");

    }

    @Test
    public void testCalculaImpostoDeRendaPrimeiraCondicao() {
        String valorEsperado = "0.0";
        Double valorAtual = (ex08_easy.calculaImpostoRenda(1903.98));

        Assert.assertEquals("O valor atual é diferente do esperado", valorEsperado, valorAtual.toString());
    }

    @Test
    public void testCalculaSalarioLiquidoSegundaFaixa() {
        String valorEsperado = "0.0";
        Double valorAtual = (ex08_easy.calculaImpostoRenda(1903.99));

        Assert.assertEquals("O valor atual é diferente do esperado", valorEsperado, valorAtual.toString());
    }

    @Test
    public void testCalculaSalarioLiquidoSegundaFaixaFinal() {
        String valorEsperado = "69,21";
        String valorAtual = formating.format(ex08_easy.calculaImpostoRenda(2826.65));

        Assert.assertEquals("O valor atual é diferente do esperado", valorEsperado, valorAtual);
    }

    @Test
    public void testCalculaSalarioLiquidoTerceiraFaixa() {
        String valorEsperado = "69,20";
        String valorAtual = formating.format(ex08_easy.calculaImpostoRenda(2826.66));

        Assert.assertEquals("O valor atual é diferente do esperado", valorEsperado, valorAtual);
    }

    @Test
    public void testCalculaSalarioLiquidoTerceiraFaixaFinal() {
        String valorEsperado = "207,86";
        String valorAtual = formating.format(ex08_easy.calculaImpostoRenda(3751.05));

        Assert.assertEquals("O valor atual é diferente do esperado", valorEsperado, valorAtual);
    }

    @Test
    public void testCalculaSalarioLiquidoQuartaFaixa() {
        String valorEsperado = "207,86";
        String valorAtual = formating.format(ex08_easy.calculaImpostoRenda(3751.06));

        Assert.assertEquals("O valor atual é diferente do esperado", valorEsperado, valorAtual);
    }

    @Test
    public void testCalculaSalarioLiquidoQuartaFaixaFinal() {
        String valorEsperado = "413,42";
        String valorAtual = formating.format(ex08_easy.calculaImpostoRenda(4664.68));

        Assert.assertEquals("O valor atual é diferente do esperado", valorEsperado, valorAtual);
    }

    @Test
    public void testCalculaSalarioLiquidoQuintaFaixa() {
        String valorEsperado = "413,43";
        String valorAtual = formating.format(ex08_easy.calculaImpostoRenda(4664.69));

        Assert.assertEquals("O valor atual é diferente do esperado", valorEsperado, valorAtual);
    }

    @Test

    public void testCalculaSalarioLiquido() {

        String valorEsperado = "1.946,54";
        String valorAtual = formating.format(ex08_easy.calculaSalarioLiquido(1950.00, ex08_easy.calculaImpostoRenda(1950.00)));

        Assert.assertEquals("O valor atual é diferente do esperado", valorEsperado, valorAtual);
    }
}
