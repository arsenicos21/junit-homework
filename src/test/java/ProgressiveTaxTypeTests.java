import org.hamcrest.core.IsEqual;
import org.junit.jupiter.api.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProgressiveTaxTypeTests {
    ProgressiveTaxType testProgressiveTaxType;

    @BeforeEach
    public void init() {
        System.out.println("test started");
        testProgressiveTaxType = new ProgressiveTaxType();
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
        double testAmount = 1000.00;
        assertThat(100.00, IsEqual.equalTo(testProgressiveTaxType.calculateTaxFor(testAmount)));
    }

    @Test
    public void testCalculateTaxForMax() {
        double testAmount = 200_000.00, excepted = 30_000.00;
        assertThat(30_000.00, IsEqual.equalTo(testProgressiveTaxType.calculateTaxFor(testAmount)));
    }
}
