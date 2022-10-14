/**
 * This class is a quirky approach to the typical "Hello, World!" program using an exception. As per the following
 * standard of this repository, this class has been named after Suraj Kumar's GitHub username.
 *
 * @author <a href="https://github.com/surajkumar">Suraj Kumar</a>
 */
public class SurajKumar {
    /**
     * The constant "Hello" portion of the "Hello, World!" message.
     * This message is displayed when an {@code Exception} occurs.
     */
    private static final String HELLO_MESSAGE = "Hello";
    /**
     * The constant "World" portion of the "Hello, World!" message.
     * This message is displayed within the {@code finally} section of our try-catch block.
     */
    private static final String WORLD_MESSAGE = "World";

    /**
     * Main entry point to this application.
     * @param args No arguments required.
     */
    public static void main(String[] args) {
        try {
            throw new Exception(HELLO_MESSAGE);
        } catch (Exception e) {
            System.err.print(e.getMessage());
        } finally {
            System.out.printf(" %s!%n\n", WORLD_MESSAGE);
        }
    }
}