import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {

    @Test
    public void testSuma() {
        int actual = Calculadora.suma(2, 3);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void testResta() {
        int actual = Calculadora.resta(3, 2);
        int expected = 1;
        assertEquals(expected, actual);
    }

}