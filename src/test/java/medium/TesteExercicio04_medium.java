package medium;

import org.junit.BeforeClass;
import org.junit.Test;

public class TesteExercicio04_medium {

    static exercicio_04_medium ex04_medium;

    @BeforeClass
    public static void beforeClass(){
        ex04_medium = new exercicio_04_medium();
    }

    @Test
    public void testeMultiplicaNumerosAteMil(){
        ex04_medium.multiplicaNumerosAteMil();
    }
}
