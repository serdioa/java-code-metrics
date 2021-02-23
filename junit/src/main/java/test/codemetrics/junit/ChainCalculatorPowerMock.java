package test.codemetrics.junit;


/**
 * Sample class for testing JUnit with PowerMock objects.
 */
public class ChainCalculatorPowerMock {

    private final Calculator calc;

    private int value;


    public ChainCalculatorPowerMock(Calculator calc) {
        this.calc = calc;
    }


    public int add(int i) {
        this.value = this.calc.add(this.value, i);
        return this.value;
    }


    public int subtract(int i) {
        this.value = this.calc.subtract(this.value, i);
        return this.value;
    }
}
