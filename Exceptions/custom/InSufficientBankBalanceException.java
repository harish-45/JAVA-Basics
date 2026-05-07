package Exceptions.custom;

public class InSufficientBankBalanceException extends Exception {
    
    public InSufficientBankBalanceException(String message) {
        super(message);
    }
}
