package cardGame.Exception;

public class InvalidCardValueException extends cardGameException{
    public InvalidCardValueException(String message) {
        super(message);
    }

    public static class StackOverflowException extends cardGameException {
        public StackOverflowException(String message) {
            super(message);
        }
    }
}
