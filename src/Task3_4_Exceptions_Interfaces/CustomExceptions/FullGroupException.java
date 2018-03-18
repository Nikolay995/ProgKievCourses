package Task3_4_Exceptions_Interfaces.CustomExceptions;

public class FullGroupException extends Exception {
    @Override
    public String getMessage() {
        return " You can not add more than 10 students to array.";
    }
}
