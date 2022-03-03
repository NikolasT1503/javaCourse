package lesson10;

public class DigitException extends Exception{
    private String digits;
    public DigitException (String message, String digits){
        super(message);
        this.digits = digits;
    }

    public String getDigits() {
        return digits;
    }
}
