package medium;

import org.junit.BeforeClass;
import org.junit.Test;

public class TesteExercicio01_medium {

        static exercicio_01_medium ex01_medium;

        @BeforeClass
        public static void beforeClass(){
            ex01_medium = new exercicio_01_medium();
        }

        @Test
        public void testExibeParOuImpar(){
            ex01_medium.exibeParOuImpar(20);
        }
    }

