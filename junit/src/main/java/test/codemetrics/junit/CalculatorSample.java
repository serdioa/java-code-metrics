package test.codemetrics.junit;


/**
 * Sample class for testing JUnit.
 */
public final class CalculatorSample implements Calculator {

    public int add(int i, int j) {
        return i + j;
    }


    public int subtract(int i, int j) {
        return i - j;
    }


    public int branch(int i, int j) {
        if (i % 2 == 0) {
            return this.add(i, j);
        } else {
            return this.subtract(i, j);
        }
    }
}
