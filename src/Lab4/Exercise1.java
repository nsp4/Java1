package Lab4;

public class Exercise1 {
	// declaring variables
	private static long accNum = 1000;
	static double minBal = 500;
	private double balance;
	private String accHolder;
	Person p;

	public void Account() {

	}

	// constructor
	public void Account(Person p) {
		this.p = p;

	}

	// getter & setters
	public static long getAccNum() {
		return accNum;
	}

	public static void setAccNum(long accNum) {
		Account.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person p) {
		this.accHolder = p.getName();
	}
public static void main(String[] args){}
	// toString method
	@Override
	public String toString() {
		return "Account [balance=" + balance + ", accHolder=" + accHolder + ", p=" + p + "]";
	}

	// logic for deposit
	public void deposit(double depAmount) {
		if (depAmount > 0) {
			this.balance += depAmount;
			System.out.println("Your total balance is: " + this.balance);
		}
	}

	// declaring withdraw method for future purpose
	public void withdraw(double withAmount) {

	}

}


