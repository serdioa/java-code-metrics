package test.codemetrics.spotbugs;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;


/**
 * Sample class for testing Spotbugs.
 */
public class SpotbugsSample {

    private Object obj;


    /**
     * A method which just returns 0 does not trigger a Spotbugs warning.
     *
     * @return the number 0.
     */
    public int zero() {
        return 0;
    }


    /**
     * A method which attempts to call {@link Object#hashCode()} on a class variable which was never initialized, causes
     * a {@link NullPointerException} and triggers a Spotbugs warning.
     *
     * @return hash code of an object reference which was never assigned to, actually causing a
     * {@link NullPointerException}.
     */
    public int nullPointerException() {
        return obj.hashCode();
    }


    /**
     * A method which causes a {@link NullPointerException} similar to {@link #nullPointerException()}, but the Spotbugs
     * warning is suppressed with an annotation:
     * <pre>{@code
     * @SuppressFBWarnings("NP_UNWRITTEN_FIELD")
     * public int nullPointerExceptionSuppressedWithAnnotation() {
     *     return obj.hashCode();
     * }
     * }</pre>
     *
     * @return hash code of an object reference which was never assigned to, actually causing a
     * {@link NullPointerException}.
     */
    @SuppressFBWarnings("NP_UNWRITTEN_FIELD")
    public int nullPointerExceptionSuppressedWithAnnotation() {
        return obj.hashCode();
    }
}
