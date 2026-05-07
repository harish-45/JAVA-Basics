package Exceptions.custom;

public class BankAccount {
    private double bankBalance;

    public BankAccount(double initialBalance) {
        this.bankBalance = initialBalance;
    }

    public void withdrow(int ammount) throws InSufficientBankBalanceException {
        if (ammount > this.bankBalance) {
            throw new InSufficientBankBalanceException("You Don't have money!  your_BALANCE : " + this.bankBalance);
        }
        bankBalance -= ammount;
    }
}
