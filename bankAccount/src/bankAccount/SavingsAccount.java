package bankAccount;

public class SavingsAccount {
	private int years = 3;
	private double openingBalance;
	private static double balance;
	private static double InterestRate=0.001;
	
	public SavingsAccount (double openingBalance) {
		this.balance = openingBalance;
	}
	
	public double getOpeningBalance() {
		return openingBalance;
	}

	public double getBalance() {
		return balance;
	}

	public double getInterestRate() {
		return InterestRate;
	}
	
	public boolean withdraw(double amount) {
		if (amount > balance || amount < 0) {
			return false;
		}else {
			return true;
		}
	}
	
	public boolean balance(double amount) {
		if (balance <= 0) {
			return false;
		}else {
			return true;
		}
		}

	public double futureValue(int years) {
		double a = (1+InterestRate) ;
		double b = years;
		double newBalance = balance* Math.pow(a, b);
		return newBalance;
	}
	public String toString() {
		
		return "Savings Account Balance: " + balance + "\n"+
			   "Savings Account Interest Rate: " + InterestRate + "\n" + 
			   "Savings Account Balance in " + years + " years: " + futureValue(years);
	}


}
