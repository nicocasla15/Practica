package test;
import org.junit.Test;
import junit.framework.TestCase;

public class testCubo extends TestCase {
    
    @Test
    public void test(){
        assertEquals(125,Calculadora.Cubo(5));
    }
}
