package com.java.trainingassignment;

//Custom Exception class
class InsufficientBalanceException extends Exception {
	private double shortfallAmount;

	public InsufficientBalanceException(double shortfallAmount) {
		this.shortfallAmount = shortfallAmount;
	}

	public double getShortfallAmount() {
		return shortfallAmount;
	}

	
	public String getMessage() {
		return "Sorry, insufficient balance, you need more " + shortfallAmount + " Rs. to perform this transaction.";
	}
}

// Bank Account class
class BankAccount {
	private double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}

	public void withdraw(double amount) throws InsufficientBalanceException {
		if (amount > balance) {
			double shortfall = amount - balance;
			throw new InsufficientBalanceException(shortfall);
		} else {
			balance -= amount;
			System.out.println("Amount " + amount + " Rs. deducted successfully. Remaining balance: " + balance + " Rs.");
		}
	}
}

public class Assign36 {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(2000);

		try {
			System.out.print("Enter withdraw amount: ");
			double withdrawAmount = 2500; // Example: You can replace this with scanner input for user interaction
			account.withdraw(withdrawAmount);
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}

}
