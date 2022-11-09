public class BankAccount {
        protected double balance;
        public void deposit(double amount)
        {
            balance += amount;
        }
        public void withdraw(double amount)
        {
            balance -= amount;
        }
        public double getBalance()
        {
            return balance;
        }
        public void AddInterest()
        {
            double rate = ((balance*10)/100);
            balance+=rate;
        }}