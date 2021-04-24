package bankAccount;
import java.lang.Math;

public class CheckingAccount {
	private int years = 3;
	private double openingBalance;
	private static double balance;
	private static double InterestRate=0.0001;
	
	public CheckingAccount (double openingBalance) {
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
		
		return "Checking Account Balance: " + balance + "\n"+
			   "Checking Account Interest Rate: " + InterestRate + "\n" + 
			   "Checking Account Balance in " + years + " years: " + futureValue(years);
	}

}
