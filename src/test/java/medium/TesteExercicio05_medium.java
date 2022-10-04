package medium;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TesteExercicio05_medium {
    static exercicio_05_medium ex05_medium;

    @BeforeClass
    public static void beforeClass() {
        ex05_medium = new exercicio_05_medium();
        }

        @Test
    public void testVerificaMenorNumero(){
        int valorEsperado = 1;
        int valorAtual = ex05_medium.verificaMenorNumero();
           // System.out.println(ex05_medium.verificaMenorNumero());

            Assert.assertEquals("Valor diferente do esperado",valorEsperado,valorAtual);
        }

    }

