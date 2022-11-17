package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class testEquals {
    String a = "jaja";
    String b = "jaja";
    String c = "jejeje";

    @Test
    public void test(){
        assertTrue(a.equals(b));
        assertFalse(a.equals(c));
    }
}
