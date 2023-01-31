package ch.tbz.com;

public class ValidInputException extends Exception{
    /**
     * Custom Exception used to inform the User to choose a valid input
     * @param errorMessage
     */
    public ValidInputException(String errorMessage) {
        super(errorMessage);
    }

}
