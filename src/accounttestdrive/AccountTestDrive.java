package accounttestdrive;

/**
 *
 * @author DAHLIA 2013-03-22
 */
public class AccountTestDrive {

    public static void main(String[] args) {
        // TODO code application logic here
        Account a1 = new Account("123-456-789");
        System.out.println("no. : " + a1.getAccountNo());
        System.out.println("initial-value : " + a1.getBalance());
        a1.deposit(10000);
        System.out.println("a1.deposit(10000); : " + a1.getBalance());
        a1.withdraw(3000);
        System.out.println("a1.withdraw(3000); : " + a1.getBalance());
        System.out.println("");

        DebitCard d1 = new DebitCard(a1);
        System.out.println("d1's balance : " + d1.getBalance());
        a1.deposit(5000);
        System.out.println("a1.deposit(5000); : " + a1.getBalance());
        System.out.println("d1's balance : " + d1.getBalance());
        System.out.println("d1's no. : " + d1.getCardNo());
    }
}

class Account {

    private int balance;
    private String accountNo;

    public Account(String no) {

        this.accountNo = no;
    }

    public Account(Account a) {
        this.accountNo = a.accountNo;
        this.balance = a.balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int n) {
        this.balance += n;
    }

    public void withdraw(int n) {
        this.balance -= n;
    }
}

class DebitCard extends Account {

    private String cardNo;
    static int n;

    public DebitCard(Account a) {
        super(a);
        this.cardNo = super.getAccountNo() + "-" + n;
        n++;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }
}