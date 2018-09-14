import org.junit.*;

import java.util.List;

public class BankAccount_Test {

    static long tmpAccountNumber; // = 987654321;
    static double tmpBalance; // = 9999.99;
    static BankAccount testAcc; // = new BankAccount(tmpAccountNumber, tmpBalance);
    private static final double DELTA = 1e-15;

    @BeforeClass
    public static void initClass() {
        tmpAccountNumber = 987654321;
        tmpBalance = 9999.99;
        testAcc = new BankAccount(tmpAccountNumber, tmpBalance);
    }

    @Before
    public void init() {
        testAcc.setAccountNumber(tmpAccountNumber);
        testAcc.setBalance(tmpBalance);
    }

    @Test
    public void verifyCredit() {
        double posCredit = 999.99;
        testAcc.credit(posCredit);
        double actualResult = testAcc.getBalance();
        double expectedResult = tmpBalance + posCredit;

        Assert.assertEquals(expectedResult, actualResult, DELTA);
    }

    @AfterClass
    public static void closeClass() {
        testAcc = null;
    }

}
