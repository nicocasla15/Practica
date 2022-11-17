package test;
import org.junit.Test;
import junit.framework.TestCase;

public class testSuma extends TestCase {
    
    @Test
    public void test() {
        assertEquals(56,Calculadora.Suma(23, 33));
        assertEquals(22, Calculadora.Suma(11, 11));
        assertEquals(2, Calculadora.Suma(1,1));
    }
}
