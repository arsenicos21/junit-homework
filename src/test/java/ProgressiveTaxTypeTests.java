import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProgressiveTaxTypeTests {
    ProgressiveTaxType sut;

    @BeforeEach
    public void init() {
        System.out.println("test started");
        sut = new ProgressiveTaxType();
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
    public void testCalculateTaxForMin() {
        //arrange
        double a = 1000.00, excepted = 100.00;

        //act
        double result = sut.calculateTaxFor(a);

        //assert
        assertEquals(excepted, result);
    }

    @Test
    public void testCalculateTaxForMax() {
        //arrange
        double a = 200_000.00, excepted = 30_000.00;

        //act
        double result = sut.calculateTaxFor(a);

        //assert
        assertEquals(excepted, result);
    }
}
