import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IncomeTaxTypeTests {
    IncomeTaxType sut;

    @BeforeEach
    public void init() {
        System.out.println("test started");
        sut = new IncomeTaxType();
    }

    @BeforeAll
    public static void started() {
        System.out.println("tests started");
    }

    @AfterEach
    public void finished() {
        System.out.println("test completed");
    }

    @AfterAll
    public static void finishedAll() {
        System.out.println("tests completed");
    }

    @Test
    public void testCalculateTaxFor() {
        //arrange
        double a = 100.00, excepted = 13.00;

        //act
        double result = sut.calculateTaxFor(a);

        //assert
        assertEquals(excepted, result);
    }
}
