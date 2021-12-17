package Home_Works.HomeWork13;

public class WrongPasswordException extends Throwable {
    private String detail;

    public WrongPasswordException(String message) {
        super(message);
        detail = message;
    }

    @Override
    public String toString() {
        return "WrongPasswordException: " + detail;
    }
}
