import javax.xml.transform.SourceLocator;

/**
 * Создать класс BankAccount который будет иметь два поля 	accountNumber и balance.
 * Реализовать в классе методы setBalance() который будет задавать баланс ,
 * credit() метод должен начислять средства на счет,
 * debit() - снимать средтва со  счета.
 * Реализовать условие что если сумма снятия меньше чем остаток на счету - вывести сообщение :
 * “Сумма снятия больше чем остаок на счету!” .
 * !!! Покрыть код юнит тестами !!!
 */

public class BankAccount {
    private long _accountNumber;
    private double _balance;

    // constructor
    public BankAccount (long accountNumber, double balance) {
        this._accountNumber = accountNumber;
        this._balance = balance;
    }
    // setters && getters
    public double getBalance() { return this._balance; }
    public void setBalance(double balance) { this._balance = balance; }
    public void setAccountNumber(long accountNumber) { this._accountNumber = accountNumber; }
    // credit
    public void credit(double addValue) {
        this._balance += addValue;
    }
    // deposit
    void deposit(double subValue) { this._balance -= subValue; }
    // debit
    public void debit(double subValue) {
        if (debitValid(subValue)) {
            deposit(subValue);
        } else {
            errorDebit();
        }
    }
    // debitValid === check the balance and the requested debit
    boolean debitValid(double subValue) {
        return subValue <= this._balance;
    }
    // info
    public void info() {
        System.out.println("Account: " + this._accountNumber + "; Balance = " + this._balance);
    }
    // send an error message
    void errorDebit() { System.out.println("Сумма снятия больше чем остаток на счету!"); }
}
