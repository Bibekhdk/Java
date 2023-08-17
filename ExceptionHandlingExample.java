class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (CustomException ce) {
            System.out.println("CustomException caught: " + ce.getMessage());
        } catch (ArithmeticException ae) {
            System.out.println("ArithmeticException caught: " + ae.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
    
    public static int divide(int dividend, int divisor) throws CustomException {
        if (divisor == 0) {
            throw new CustomException("Cannot divide by zero.");
        }
        return dividend / divisor;
    }
}
