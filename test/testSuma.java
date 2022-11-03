package test;
import org.junit.Test;
import junit.framework.TestCase;

public class testSuma extends TestCase {
    
    @Test
    public void test() {
        Calculadora suma = new Calculadora();
        int resultado = suma.Suma(11, 11);
        assertEquals(22,resultado);
        assertEquals(13, 12+1);
    }
}
