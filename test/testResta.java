package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testResta {
    @Test
    public void test() {
        Calculadora resta = new Calculadora();
        int resultado = resta.Resta(50, 25);
        assertEquals(25, resultado);
    }

}
