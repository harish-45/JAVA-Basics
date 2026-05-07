package Exceptions.custom;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000);

        try {
            bankAccount.withdrow(10000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
