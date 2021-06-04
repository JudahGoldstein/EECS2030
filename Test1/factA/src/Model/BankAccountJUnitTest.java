package Model;
import static org.junit.Assert.*;
import org.junit.Test;

public class BankAccountJUnitTest {

    @Test
    public void test() {
        //make b1 and b2
        BankAccount b1 = new BankAccount("b");
        BankAccount b2 = new BankAccount("b");
        //set their balances
        b1.setBalance(10);
        b2.setBalance(10);
        //check that the set balance worked
        assertEquals(10, b1.getBalance(), 0);
        assertEquals(10, b2.getBalance(), 0);
        //check that .equals() works
        assertEquals(true, b1.equals(b2));
    }
}
