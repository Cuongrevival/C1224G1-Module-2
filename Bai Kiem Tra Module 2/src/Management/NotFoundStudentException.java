package Management;

public class NotFoundStudentException extends RuntimeException {
    public NotFoundStudentException(String message) {
        super(message);
    }
}
