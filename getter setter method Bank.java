public class Bank {
    private String bankName;
    private double balance;

    public Bank(String bankName, double balance) {
        this.bankName = bankName;
        this.balance = balance;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        
        Bank myBank = new Bank("DESHI BANK", 5000.0);

        
        System.out.println("Bank Name: " + myBank.getBankName());
        System.out.println("Balance: " + myBank.getBalance());

    }
}
