package test.codemetrics.junit;

import static org.junit.Assert.assertEquals;

import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;


/**
 * Sample class for testing JUnit with PowerMock.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(CalculatorSample.class)
public class ChainCalculatorPowerMockTest {

    private Calculator mockCalculator;


    @Test
    public void testAdd() {
        // Configure the class CalculatorSample as a partial mock.
        // Use a very weird mock implementation of the method "add" to make sure that the mock implementation
        // instead of the real implementation is executed.
        this.mockCalculator = PowerMock.createPartialMock(CalculatorSample.class, "add");
        EasyMock.expect(this.mockCalculator.add(0, 3)).andReturn(5);
        PowerMock.replay(this.mockCalculator);

        // Expect the non-standard (PowerMock) implementation of the method "add" to be executed.
        ChainCalculatorMock chainCalculator = new ChainCalculatorMock(this.mockCalculator);
        assertEquals(5, chainCalculator.add(3));

        PowerMock.verify(this.mockCalculator);
    }
}
