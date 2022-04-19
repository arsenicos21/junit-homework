import org.hamcrest.core.IsEqual;
import org.junit.jupiter.api.*;
import org.hamcrest.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.object.IsCompatibleType.typeCompatibleWith;

public class VATaxTypeTests {
    VATaxType testVATaxType;

    @BeforeEach
    public void init() {
        System.out.println("test started");
        testVATaxType = new VATaxType();
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
        double testAmount = 100_000.00;
        assertThat(18000.00, IsEqual.equalTo(testVATaxType.calculateTaxFor(testAmount)));
    }

    @Test
    public void givenSubClass_whenTypeCompatible_thenTrue() {
        assertThat(VATaxType.class, typeCompatibleWith(TaxType.class));
    }
}
