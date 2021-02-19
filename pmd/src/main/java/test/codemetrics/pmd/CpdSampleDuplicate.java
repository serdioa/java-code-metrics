package test.codemetrics.pmd;


/**
 * Another sample class for testing CPD (copy-paste detection).
 */
public class CpdSampleDuplicate {

    /**
     * A sample method duplicated in the class {@link CpdSample} triggers a CPD warning.
     */
    public void cpdSampleMethod() {
        for (int i = 0; i < 100; ++i) {
            sampleInnerMethod(i);
            sampleInnerMethod(i);
            sampleInnerMethod(i);
            sampleInnerMethod(i);
            sampleInnerMethod(i);
            sampleInnerMethod(i);
            sampleInnerMethod(i);
            sampleInnerMethod(i);
            sampleInnerMethod(i);
            sampleInnerMethod(i);
            sampleInnerMethod(i);
            sampleInnerMethod(i);
            sampleInnerMethod(i);
            sampleInnerMethod(i);
            sampleInnerMethod(i);
            sampleInnerMethod(i);
        }
    }


    private int sampleInnerMethod(int i) {
        return i * 2;
    }
}
