package test.codemetrics.pmd;


/**
 * Sample class for testing PMD.
 */
public class PmdSample {

    /**
     * A method with a valid name does not trigger a PMD warning.
     *
     * @return a dummy value.
     */
    public int validMethod() {
        return 0;
    }


    /**
     * A method with an unused local variable violates the PMD rules and triggers a PMD warning.
     */
    public void unusedLocalVariable() {
        int i;
    }


    /**
     * Another method with an unused local variable violates the PMD rules, but the PMD warning is suppressed with an
     * annotation:
     * <pre>{@code
     * @SuppressWarnings("PMD.UnusedLocalVariable")
     * public int unusedLocalVariableSuppressedWithAnnotation() {
     *     int j;
     * }
     * }
     * </pre>
     */
    @SuppressWarnings("PMD.UnusedLocalVariable")
    public void unusedLocalVariableSuppressedWithAnnotation() {
        int j;
    }


    /**
     * And yet another method with an unused local variable violates the PMD rules, but the PMD warning is suppressed
     * with a comment:
     * <pre>{@code
     * @SuppressWarnings("PMD.UnusedLocalVariable")
     * public int unusedLocalVariableSuppressedWithComment() {
     *     nt k; // NOPMD
     * }
     * }
     * </pre>
     */
    public void unusedLocalVariableSuppressedWithComment() {
        int k; // NOPMD
    }
}
