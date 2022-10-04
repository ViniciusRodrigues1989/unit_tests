package medium;

import org.junit.BeforeClass;
import org.junit.Test;

public class
TesteExercicio03_medium {

    static exercicio_03_medium ex03_medium;

    @BeforeClass
    public static void beforeClass() {
        ex03_medium = new exercicio_03_medium();
    }

    @Test
    public void testeSomarNumeroAcumulado() {
        ex03_medium.somarNumerosAcumulados();
    }
}
