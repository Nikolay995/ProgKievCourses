package task3_4_Exceptions_Interfaces;

public class CustomException extends Exception {

    @Override
    public String getMessage() {
        return "Group is full";
    }

}