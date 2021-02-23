package test.codemetrics.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;


/**
 * Sample class for testing JUnit.
 */
public class CalculatorSampleTest {

    private CalculatorSample sample;


    @Before
    public void setUp() {
        this.sample = new CalculatorSample();
    }


    @Test
    public void testAdd() {
        assertEquals(5, this.sample.add(2, 3));
    }


    // Tests only one branch of two available in the method.
    @Test
    public void testBranch() {
        assertEquals(5, this.sample.branch(2, 3));
    }
}
