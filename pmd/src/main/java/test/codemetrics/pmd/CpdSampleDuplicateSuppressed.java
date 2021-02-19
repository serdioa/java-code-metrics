package test.codemetrics.pmd;


/**
 * A sample class shows how to disable detection of duplicates by CPD (copy-paste detection).
 */
public class CpdSampleDuplicateSuppressed {

    /**
     * A sample method duplicated in the class {@link CpdSample}, but a CPD warning is disabled by a comment:
     * <pre>
     * // Turn off CPD analysis: CPD-OFF
     * public void cpdSampleMethod() {
     *     // ... here comes duplicated code ...
     * }
     * // Turn on CPD analysis again: CPD-ON
     * </pre>
     */
    // Tell cpd to start ignoring duplicated code: CPD-OFF
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
    // Tell cpd to stop ignoring duplicated code, that is analyze duplications again: CPD-ON


    private int sampleInnerMethod(int i) {
        return i * 2;
    }
}
