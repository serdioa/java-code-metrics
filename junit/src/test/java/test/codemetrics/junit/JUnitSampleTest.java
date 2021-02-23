package test.codemetrics.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;


/**
 * Sample class for testing JUnit.
 */
public class JUnitSampleTest {

    private JUnitSample sample;


    @Before
    public void setUp() {
        this.sample = new JUnitSample();
    }


    @Test
    public void testAdd() {
        assertEquals(5, this.sample.add(2, 3));
    }


    @Test
    public void testBranch() {
        assertEquals(5, this.sample.branch(2, 3));
    }
}
