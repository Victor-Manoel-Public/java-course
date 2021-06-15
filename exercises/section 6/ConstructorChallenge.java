public class ConstructorChallenge {
    // this is the part 1 of the challenge, part 2 is coming soon.
    // create a new class for bank account
    // create fields for the account number, balance, customer name, email and phone number.

    // create getters and setters for each field
    // create 2 additional methods
    // 1. to allow the customer to deposit funds (this should increment the balance field).
    // 2. to allow the customer to withdraw funds. (this should deduct from the balance field).
    // but not allow the withdraw to complete if their insufficient funds.

    public static class BankAccount {
        private int accountNumber;
        private double balance;
        private String customerName;
        private String customerEmail;
        private String customerPhone;

        public BankAccount(){
            this(124, 0, "John Doe", "johndoe@123.com", "+1 4545");
        }
        public BankAccount(int accountNumber, double balance, String customerName, String customerEmail, String customerPhone){
            this.accountNumber = accountNumber;
            this.balance = balance;
            this.customerName = customerName;
            this.customerEmail = customerEmail;
            this.customerPhone = customerPhone;
        }
        public void setAccountNumber(int accountNumber) {
            this.accountNumber = accountNumber;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public void setCustomerEmail(String customerEmail) {
            this.customerEmail = customerEmail;
        }

        public void setCustomerPhone(String customerPhone) {
            this.customerPhone = customerPhone;
        }

        public double getBalance() {
            return balance;
        }

        public int getAccountNumber() {
            return accountNumber;
        }

        public String getCustomerEmail() {
            return customerEmail;
        }

        public String getCustomerName() {
            return customerName;
        }

        public String getCustomerPhone() {
            return customerPhone;
        }

        public void depositFunds(double value){
            this.balance += value;
        }

        public void withDraw(double value){
            if( (this.balance <= 0) || (value > this.balance) || (this.balance - value < 0) ){
                String formatValue = String.format("%.2f", value);
                String formatBalance = String.format("%.2f", this.balance);
                System.out.printf("You cannot withdraw.\nRequested: %s\nYour total: %s\n", formatValue, formatBalance);
            }else{
                this.balance -= value;
                String formattedValue = String.format("%.2f", value);
                String formattedBalance = String.format("%.2f", this.balance);
                System.out.printf("$%s withdraw with success!\nYour new total: $%s", formattedValue, formattedBalance);
            }
        }
    }

    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        bank.withDraw(1200);
       // String balance = String.format("%.2f", bank.getBalance());

    }
}
