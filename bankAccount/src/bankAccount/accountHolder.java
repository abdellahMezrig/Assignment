package bankAccount;

public class accountHolder {
	
	private String FirstName;
	private String MiddleName;
	private String LastName;
	private String ssn;
	private double checkingAccountOpeningBalance;
	private double savingsAccountOpeningBalance;
	private double CheckingAccount;
	private double SavingsAccount;
	private CheckingAccount checking;
	private SavingsAccount Saving;
	
	
	
	public accountHolder (String FirstName, String MiddleName, String LastName, String ssn,double checkingAccountOpeningBalance,
			double savingsAccountOpeningBalance, CheckingAccount checking,SavingsAccount Saving) {
		System.out.println("Account constructor with parameters called");
		this.FirstName=FirstName;
		this.MiddleName=MiddleName;
		this.LastName = ssn;
		this.checking = new CheckingAccount(checkingAccountOpeningBalance);
		this.Saving = new SavingsAccount (savingsAccountOpeningBalance);
		
	}
	
	
	public void depositCheckingAccount(double depositAmount) {
		this.checkingAccountOpeningBalance += depositAmount;
		System.out.println("deposit of " + depositAmount + " made.new balance is " + this.checkingAccountOpeningBalance);
	}
	
	
	public void depositSavingAccount(double depositAmount) {
		this.savingsAccountOpeningBalance += depositAmount;
		System.out.println("deposit of " + depositAmount + " made.new balance is " + this.savingsAccountOpeningBalance);
	}
	
	
	
	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getMiddleName() {
		return MiddleName;
	}

	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public double getCheckingAccountOpeningBalance() {
		return checkingAccountOpeningBalance;
	}

	public void setCheckingAccountOpeningBalance(double checkingAccountOpeningBalance) {
		this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
	}

	public double getSavingsAccountOpeningBalance() {
		return savingsAccountOpeningBalance;
	}

	public void setSavingsAccountOpeningBalance(double savingsAccountOpeningBalance) {
		this.savingsAccountOpeningBalance = savingsAccountOpeningBalance;
	}
	
	

}
