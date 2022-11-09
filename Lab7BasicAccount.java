public class Lab7BasicAccount extends BankAccount{
        public void withdraw(double amount)
        {
            if(amount<=this.balance)
            {
                super.withdraw(amount);
            }
            else
                super.withdraw(amount+30);
            System.out.println("Your Withdraw is More Than You Have");
        }
    }
