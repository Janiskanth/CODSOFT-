
public class Account {

	private double balance=0;
	
	public double getBalance() {
		
		return this.balance;
	}
	
	public void withdraw(int amount) {
		
		balance=balance - amount;
	}
	public void deposit(int amount) {
		
		balance=balance + amount;
	}
	

}
