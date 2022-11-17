package test;
import org.junit.Test;
import junit.framework.TestCase;

public class testMaximo extends TestCase{

    @Test
    public void test(){
        assertEquals(4, Calculadora.Maximo(new int[]{1,2,2,3,3,3,4}));
    }
    
}
