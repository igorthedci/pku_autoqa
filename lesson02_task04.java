/**
 * Создать класс BankAccount который будет иметь два поля 	accountNumber и balance.
 * Реализовать в классе методы setBalance() который будет задавать баланс ,
 * credit() метод должен начислять средства на счет,
 * debit() - снимать средтва со  счета.
 * Реализовать условие что если сумма снятия меньше чем остаток на счету - вывести сообщение :
 * “Сумма снятия больше чем остаок на счету!” .
 *
 * Создать обьект класса и проверить работу программы.
 */

public class Main {

    public static void main(String[] args) {
	// write your code here

        BankAccount fooAcc = new BankAccount(987654321, 0);

        fooAcc.info();
        fooAcc.credit(9999.9);
        fooAcc.info();
        fooAcc.debit(999.9);
        fooAcc.info();
        fooAcc.debit(9999.9);
        fooAcc.info();
    }
}


public class BankAccount {
    private long _accountNumber;
    private double _balance;

    // constructor
    public BankAccount (long accountNumber, double balance) {
        this._accountNumber = accountNumber;
        this._balance = balance;
    }
    // credit
    public void credit(double addValue) {
        this._balance += addValue;
    }
    // debit
    public void debit(double subValue) {
        if (subValue > this._balance) {
            System.out.println("Сумма снятия больше чем остаок на счету!");
            return;
        }
        this._balance -= subValue;
    }
    // info
    public void info() {
        System.out.println("Account: " + this._accountNumber + "; Balance = " + this._balance);
    }
}
