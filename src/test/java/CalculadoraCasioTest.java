import org.junit.*;

import static org.junit.Assert.assertEquals;

public class CalculadoraCasioTest {

    static CalculadoraCasio calculadoraCasio;

    @BeforeClass
    public static void beforeClassTest() {
        System.out.println("before class ");
        calculadoraCasio = new CalculadoraCasio();
    }

    @Before
    public void before() {
        //Act
        System.out.println("before()");
        calculadoraCasio.clear();
    }

    @After
    public void after() {
        System.out.println("after()");
    }

    @AfterClass
    public static void afterClassTest() {
        System.out.println("afterClass()");
    }

    @Test
    public void testSuma() {
        System.out.println("testSuma()");
        int actual = calculadoraCasio.sum(5, 5);
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void tetsDivDosNumerosSiendoDividendoDiferenteDeCero() {
        System.out.println("testDivDIferenteDeCero()");
        calculadoraCasio.div(5, 0);
    }

    @Test(expected = ArithmeticException.class) //siempre va a fallar en el caso de que no salga la excepcion
    public void tetsDivPorCero() {
        System.out.println("testDivEntreCero()");
        calculadoraCasio.div(5, 0);
    }


    @Test(timeout = 1000)
    public void testOperacionOptima() {
        System.out.println("testOperacionOptima");
        calculadoraCasio.operacionMuyOptima();
    }

    @Test
    public void testAnsSuma() {
        System.out.println("ansSuma()");
        calculadoraCasio.sum(3, 2);

        int actual = calculadoraCasio.getAns();
        int expected = 5;
        assertEquals(expected, actual);
    }

}