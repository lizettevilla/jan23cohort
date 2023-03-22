package com.codingdojo.com.BankAccount;
import java.util.Random;

	public class BankAccount {
		public String name;
		public String accountNumber;
		public double checkingBalance;
		public double savingsBalance;
		public static double sumOfAllAccounts = 0;
		private static int numberOfAccounts = 0;
		
		public BankAccount(String name) {
			this.name = name;
			this.checkingBalance = 0;
			this.savingsBalance = 0;
			this.accountNumber = randomAccountNumber();
			numberOfAccounts++;
		}
		
		public BankAccount(String name, double checkBalParams, double saveBalParams) {
			this.name = name;
			this.checkingBalance = checkBalParams;
			this.savingsBalance = saveBalParams;
			this.accountNumber = randomAccountNumber();
			sumOfAllAccounts = sumOfAllAccounts + checkBalParams + saveBalParams;
			numberOfAccounts++;
		}
		
		// method that returns number of instances of BankAccount class (accounts)
		public static int accountCounter() {
			return numberOfAccounts;
		}
		
		// method to deposit into checking account
		public void checkingDeposit(double deposit) {
			this.checkingBalance += deposit;
			sumOfAllAccounts += deposit;
		}
		
		// method to withdraw from checking account
		public void checkingWithdrawal(double withdrawal) {
			if (withdrawal <= this.checkingBalance) {
				this.checkingBalance -= withdrawal;
				sumOfAllAccounts -= withdrawal;
			} else {
				System.out.println("Insufficient Funds in Checking");
			}
		}
		
		// method to deposit into savings account
		public void savingsDeposit(double deposit) {
			this.savingsBalance += deposit;
			sumOfAllAccounts += deposit;
		}
		
		// method to withdraw from savings account
		public void savingsWithdrawal(double withdrawal) {
			if (withdrawal <= this.savingsBalance) {
				this.savingsBalance -= withdrawal;
				sumOfAllAccounts -= withdrawal;
			} else {
				System.out.println("Insufficient Funds in Savings");
			}
			
		}
		
		// method to show current balance (account statement)
		public void printAccountStatement() {
			System.out.println(this.name + "'s Accounts | Checking: $" + checkingBalance + "0 | Savings: $" + savingsBalance + "0");
		}
		
		// method to generate a random 10-digit number
		private String randomAccountNumber() {
			Random rand = new Random();
			long tenDigitNum = (long) (rand.nextDouble() * 1000000000);
			String randAcctNum = Long.toString(tenDigitNum);
//			System.out.println("This is our random account number: " + randAcctNum);
			return randAcctNum;
		}
		
		// method to show sum of all money in bank
		public static void printTotalSum() {
			System.out.println("Bank's Total Sum: $" + sumOfAllAccounts + "0");
		}
		
		
	}
