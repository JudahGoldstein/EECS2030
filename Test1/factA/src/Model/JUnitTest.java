package Model;

import java.util.Random;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JUnitTest {
    Random r = new Random();
    @Test
    public void test1() throws Exception {
        FactorialB f = new FactorialB();
        FactorialA f2 = new FactorialA();
        f.calculateWithCache(5);
        f.calculateWithCache(10);
        int random = r.nextInt(170);
        assertEquals(f.calculateWithCache(random), f2.calculate(random));
    }
}
