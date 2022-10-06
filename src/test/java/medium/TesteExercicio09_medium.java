package medium;

import org.junit.BeforeClass;
import org.junit.Test;

public class TesteExercicio09_medium {

   static exercicio_09_medium ex09_medium;

   @BeforeClass
    public static void beforeClass(){
        ex09_medium = new exercicio_09_medium();
    }

    @Test
    public void testeRecebeNumeroAluno(){
       ex09_medium.recebeNumeroAluno();
    }
    @Test
    public void testeRecebeImprimeNomeENumero(){
       ex09_medium.recebeImprimeNomeNumeroAluno();
    }
    @Test
    public void testeRecebeAluno(){
       ex09_medium.recebeAluno();
    }
}
