package test.codemetrics.checkstyle;


/**
 * Sample class for testing Checkstyle.
 */
public class CheckstyleSample {

    /**
     * A method with a valid name which will not trigger a Checkstyle warning.
     *
     * @return a dummy value.
     */
    public int validMethodName() {
        return 0;
    }


    /**
     * A method with a name which violates Checkstyle rules and triggers a Checkstyle warning.
     *
     * @return a dummy value.
     */
    public int INVALID_METHOD_NAME() {
        return 0;
    }


    /**
     * Another method with a name which violates Checkstyle rules, but the Checkstyle warning is suppressed with an
     * annotation:
     * <pre>{@code
     * @SuppressWarnings("checkstyle:methodname")
     * public int INVALID_METHOD_NAME_SUPPRESSED_WITH_ANNOTATION() {
     *     return 0;
     * }
     * }
     * </pre>
     *
     * @return a dummy value.
     */
    @SuppressWarnings("checkstyle:methodname")
    public int INVALID_METHOD_NAME_SUPPRESSED_WITH_ANNOTATION() {
        return 0;
    }


    /**
     * And yet another method with a name which violates Checkstyle rules, but the Checkstyle warning is suppressed with
     * a comment:
     * <pre>
     * // CHECKSTYLE.OFF: MethodName
     * public int INVALID_METHOD_NAME_SUPPRESSED_WITH_COMMENT() {
     *     return 0;
     * }
     * // CHECKSTYLE.ON: MethodName
     * </pre>
     *
     * @return a dummy value.
     */
    // CHECKSTYLE.OFF: MethodName
    public int INVALID_METHOD_NAME_SUPPRESSED_WITH_COMMENT() {
        return 0;
    }
    // CHECKSTYLE.ON: MethodName
}
