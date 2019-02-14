import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
//Oye corre esto con un runner particular | Se ocupa de hacer las pruebas parametrizadas
public class CalculadoraCasioTest2 {

    //Necesita un metodo public static que devuelva un Iterable
    //Que sea de tipo Object
    @Parameters
    public static Iterable<Object[]> getData() {
        //el array de objetos que tenemos ahi debe tener tantas posiciones como parametros tenga el constructor

        return Arrays.asList(new Object[][]{
                {3, 1, 4}, {3, 3, 6}, {9, 1, 10}
        });
    }

    private int a, b, exp;

    public CalculadoraCasioTest2(int a, int b, int exp) {
        this.a = a;
        this.b = b;
        this.exp = exp;
    }

    @Test
    public void tetsSum() {
        CalculadoraCasio calculadoraCasio = new CalculadoraCasio();

        int actual = calculadoraCasio.sum(a, b);

        assertEquals(exp, actual);
    }

}