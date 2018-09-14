import org.junit.*;

import java.util.List;

public class BankAccount_Test {

    static long testAccountNumber; // = 987654321;
    static double testBalance; // = 9999.99;
    static BankAccount testAccount; // = new BankAccount(tmpAccountNumber, tmpBalance);
    private static final double DELTA = 1e-15;

    @BeforeClass
    public static void initClass() {
        testAccountNumber = 987654321;
        testBalance = 9999.99;
        testAccount = new BankAccount(testAccountNumber, testBalance);
    }

    @Before
    public void init() {
        testAccount.setAccountNumber(testAccountNumber);
        testAccount.setBalance(testBalance);
    }

    @Test
    public void verifyCredit() {
        double posCredit = 999.99;
        testAccount.credit(posCredit);
        double actualResult = testAccount.getBalance();
        double expectedResult = testBalance + posCredit;

        Assert.assertEquals(expectedResult, actualResult, DELTA);
    }

    @Test
    public void verifyDebitPositiveCase01() {
        double posDebit = 999.99;
        testAccount.debit(posDebit);
        double actualResult = testAccount.getBalance();
        double expectedResult = testBalance - posDebit;

        Assert.assertEquals(expectedResult, actualResult, DELTA);
    }

    @Test
    public void verifyDebitPositiveCase02() {
        double posDebit = testAccount.getBalance();
        testAccount.debit(posDebit);
        double actualResult = testAccount.getBalance();
        double expectedResult = testBalance - posDebit;

        Assert.assertEquals(expectedResult, actualResult, DELTA);
    }
    @Test
    public void verifyDebitNegativeCase03() {
        double expectedResult = testBalance;
        double posDebit = testAccount.getBalance() + 1;
        testAccount.debit(posDebit);
        double actualResult = testAccount.getBalance();

        Assert.assertEquals(expectedResult, actualResult, DELTA);
    }
    @Test
    public void verifyDebitValidNegativeCase04() {
        boolean expectedResult = false;
        boolean actualResult = testAccount.debitValid(testBalance + 1);

        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void verifyDebitValidPositiveCase05() {
        boolean expectedResult = true;
        boolean actualResult = testAccount.debitValid(testBalance);

        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void verifyDepositPositiveCase06() {
        double expectedResult = testBalance;
        testAccount.deposit(0);
        double actualResult = testAccount.getBalance();

        Assert.assertEquals(expectedResult, actualResult, DELTA);
    }
    @Test
    public void verifyDepositPositiveCase07() {
        double expectedResult = 0.0;
        testAccount.deposit(testBalance);
        double actualResult = testAccount.getBalance();

        Assert.assertEquals(expectedResult, actualResult, DELTA);
    }

    @AfterClass
    public static void closeClass() {
        testAccount = null;
    }

}
