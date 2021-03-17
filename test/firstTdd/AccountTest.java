package firstTdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountTest {


    @Test
    void account_canReceiveDeposit(){
        MyAccount account = new MyAccount();
        account.deposit(2500.00);

        assertEquals(2500.00, account.getBalance());

    }
    @Test
    void depositTwice_accountBalance(){
        MyAccount account = new MyAccount();
        account.deposit(2500.00);

        account.deposit(2000);

        assertEquals(4500.00, account.getBalance());

    }
    @Test
    void accountCannotReceiveNegativeDepositTest(){
        MyAccount selfAccount = new MyAccount();

        selfAccount.deposit(-970297372);
        assertEquals(0,selfAccount.getBalance());
    }
    @Test
    void moneyCanBeWithdrawnWithValidPinTest() {
        MyAccount secondAccount = new MyAccount();
        secondAccount.deposit(3000);
        secondAccount.setPin(1234);

        secondAccount.withdrawMoney(2000, 1234);

        assertTrue(secondAccount.getBalance() == 1000);

    }

    @Test
    void moneyCannotBeWithdrawnWithInvalidPinTest(){
        MyAccount secondAccount = new MyAccount();
        secondAccount.deposit(3000);
        secondAccount.setPin(1234);

        secondAccount.withdrawMoney(2000, 2234);

        assertTrue(secondAccount.getBalance() == 5000);
    }

}
