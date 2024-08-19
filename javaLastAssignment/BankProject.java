package javaLastAssignment;

class BankAccount{
	private String accno;
	private String username;
    private String password;
	private double balance;
	public BankAccount(String string, double d, String string2, String string3) {
		this.accno=accno;
		this.balance=balance;
		this.username=username;
		this.password=password;
	}
	
	public String getAccno() {
		return accno;
	}
	
	 public boolean validateUser(String username, String password) {
	        return this.username.equals(username) && this.password.equals(password);
	    }
	public double getBalance() {
		return balance;
	}
	public void deposit(double amount) {
		balance=balance+amount;
	}
	public void withdraw(double amount) throws InsufficientFundsException{
		if(balance>amount) {
			balance=balance-amount;
		}
		else {
			InsufficientFundsException IFE = new InsufficientFundsException();
			System.out.println(IFE.getMessage());
			throw IFE;
		}
	}
}
class InsufficientFundsException extends Exception {
	public String getMessage() { // inbuild method
		return "Insufficient funds!";
	}
}
class InvalidAccountException extends Exception {
    public String InvalidAccountException() {
        return " Invalid Account Number. Account does not exist.";
    }
}

class NetworkFailureException extends Exception {
    public String NetworkFailureException(String message) {
       return "Temporary issue connecting to the bank's server. Transaction failed due to poor network ";
    }
    
}

class BankOperation{
	private BankAccount Acc1;//BankAccount used class name as data type here encapsulation did so that can access all method 
	private BankAccount Acc2;
	public BankOperation(BankAccount accountA, BankAccount accountB) {
		this.Acc1=Acc1;
		this.Acc2=Acc2;
	}
	
	public BankAccount findAccount(String accno) throws InvalidAccountException {
        if (Acc1.getAccno().equals(accno)) {
            return Acc1;
        } else if (Acc2.getAccno().equals(accno)){
            return Acc2;
        } else {
        	InvalidAccountException IAE = new InvalidAccountException();
			System.out.println(IAE.getMessage());
			throw IAE;
        }
    }
	public void transfer(String Acc1, String Acc2, double amount, String login,String password) 
			throws InvalidAccountException, NetworkFailureException, InsufficientFundsException {
	//add if else condition here to login and then transfer
		
		if(login=="admin"&&password=="admin@123") {
			BankAccount fromAcc1 = findAccount(Acc1);
			BankAccount toAcc2 = findAccount(Acc2);
			fromAcc1.withdraw(amount); 
			toAcc2.deposit(amount);

		        System.out.println("Transfer successful. RS." + amount + " transferred from " + fromAcc1 + " to " + toAcc2);

		}
		else if(networkIsDown()) {
			NetworkFailureException NFE=new NetworkFailureException();
			System.out.println(NFE.getMessage());
			throw NFE;
		}
	
	}
	boolean networkIsDown() {
		
		return false;
	}
	
}
public class BankProject {

	public static void main(String[] args) {
		BankAccount accountA = new BankAccount("5678436A",5689.00,"admin","admin@123");
		BankAccount accountB = new BankAccount("8767653B",5648.00,"admin","admin@123");
		BankOperation oper= new BankOperation(accountA,accountB);
		try {
			oper.transfer("5678436A", "8767653B", 10000.00, "admin","admin@123");
		} catch (InvalidAccountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NetworkFailureException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
