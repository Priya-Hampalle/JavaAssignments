package javaLastAssignment;
//Write a java program for a bank that allows users to manage their accounts. 
//Each account has a unique number and users can deposit, withdraw and check their bank balance.
class Account{
	private int accno;
	private double balance;
	public Account(int accno,double balance) {
		this.accno=accno;
		this.balance=balance;
		
	}
	public int getaccno(){
		return accno;
	}
	public double balance() {
		return balance;
	}
	void deposit() {
		double amount = 500.00;
		if(amount>0) {
			balance=balance+amount;
			System.out.println("Total Amount Deposited is: "+amount);
		}
		else {
			System.out.println("user not deposited money");
		}
	}
	void withdraw() {
		double amount = 200.00;
		if(balance>amount) {
			balance=balance-amount;
			System.out.println("Total Amount withdraw is: "+amount);
		}
		else {
			System.out.println("Insufficent balance");
		}
	}
	public void checkBalance() {
		System.out.println("Account number: "+accno + "Balance in account: "+balance);
    }
	
}

public class BankManageAccount {
	public static void main(String[] args) {
		Account account1 = new Account(123456,45000.00);
        account1.deposit();      
        account1.withdraw();  
        account1.checkBalance();

}
}
