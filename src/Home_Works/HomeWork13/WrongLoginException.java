package Home_Works.HomeWork13;

public class WrongLoginException extends Throwable {
    private String detail;

    public WrongLoginException(String message) {
        super(message);
        detail = message;
    }
    @Override
    public String toString() {
        return "WrongLoginException: " + detail;
    }
}
