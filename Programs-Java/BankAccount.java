public class BankAccount {
    static int totalAccounts;

    static {
        totalAccounts = 0;
    }

    public BankAccount() {
        totalAccounts++;
        printAccounts();
    }

    public static void printAccounts() {
        System.out.println("Total number of Accounts: " + totalAccounts);
    }

    public static void main(String[] args) {
        System.out.println("Current Number of Accounts: " + totalAccounts);
        BankAccount _ = new BankAccount();
        BankAccount _ = new BankAccount();
        BankAccount _ = new BankAccount();
        BankAccount _ = new BankAccount();
        BankAccount _ = new BankAccount();
        BankAccount _ = new BankAccount();
        BankAccount _ = new BankAccount();
    }
    
}
