package medium;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TesteExercicio06_medium {
    static exercicio_06_medium ex06_medium;

    @BeforeClass
    public static void beforeClass(){
        ex06_medium = new exercicio_06_medium();
    }

    @Test
    public void testValidaFatorial(){
        int valorEsperado=3628800 ;
        int valorAtual = ex06_medium.calculaFatorial(10);
       // System.out.println(ex06_medium.calculaFatorial(10));

        Assert.assertEquals("Valor diferente do esperado",valorEsperado,valorAtual);

    }

}
