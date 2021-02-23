package test.codemetrics.junit;

import static org.junit.Assert.assertEquals;

import org.easymock.EasyMock;
import org.junit.Test;


/**
 * Sample class for testing JUnit with EasyMock.
 */
public class ChainCalculatorMockTest {

    private Calculator mockCalculator;


    @Test
    public void testAdd() {
        this.mockCalculator = EasyMock.mock(Calculator.class);
        EasyMock.expect(this.mockCalculator.add(0, 3)).andReturn(3);
        EasyMock.replay(this.mockCalculator);

        ChainCalculatorMock chainCalculator = new ChainCalculatorMock(this.mockCalculator);
        assertEquals(3, chainCalculator.add(3));

        EasyMock.verify(this.mockCalculator);
    }
}
