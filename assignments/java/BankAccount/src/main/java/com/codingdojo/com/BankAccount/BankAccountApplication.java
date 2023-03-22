package com.codingdojo.com.BankAccount;

public class BankAccountApplication {
	public static void main(String[] args) {
		
		BankAccount Lizette = new BankAccount("Lizette");
		
		Lizette.checkingDeposit(5000);
		Lizette.savingsDeposit(10000);
		Lizette.printAccountStatement();
		Lizette.checkingWithdrawal(100);
		Lizette.savingsWithdrawal(200);
		Lizette.printAccountStatement();
		
		
		BankAccount CashCount = new BankAccount("CashCount");
		
		CashCount.printAccountStatement();
		CashCount.savingsWithdrawal(1000);
		
		System.out.println(BankAccount.accountCounter());
		BankAccount Person = new BankAccount("Person", 100.0, 200.0);
		
		Person.printAccountStatement();
		System.out.println(BankAccount.accountCounter());
		BankAccount.printTotalSum();
	}
}