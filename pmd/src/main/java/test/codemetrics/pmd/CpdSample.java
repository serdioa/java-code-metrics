package test.codemetrics.pmd;


/**
 * Sample class for testing CPD (copy-paste detection).
 */
public class CpdSample {

    /**
     * A sample method duplicated in two other classes: {@link CpdSampleDuplicate} and
     * {@link CpdSampleDuplicateSuppressed}. The latter shows how to suppress detection of duplicates.
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
