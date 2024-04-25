import java.util.Scanner;
public class ATM {

	Account acc = new Account();
	public static void main(String[] args) {
		
		ATM atm = new ATM();
		Scanner scan = new Scanner(System.in);
		
		boolean tryagain = true;
		
		while(tryagain) {
			System.out.println("=================================================");
			System.out.println("Welcome to ATM Mechine");
			System.out.println("=================================================");
			System.out.println("Withdraw: 1 \nDepositing: 2 \nBalance Check: 3");
			System.out.println("Enter the Option: ");
			int opt = scan.nextInt();
			
			switch (opt) {
			
			case 1: {
				
				System.out.println("Enter the Withdraw Amount: ");
				int amount = scan.nextInt();
				atm.withdraw(amount);
				break;
			}
			case 2: {
				System.out.println("Enter the Deposit Amount: ");
				int amount = scan.nextInt();
				atm.deposit(amount);
				break;
			}
			case 3 : {
				atm.balanceCheck();
				break;
			}
			default: {
				System.out.println("Invalid Input");
			}
			}
			System.out.println("");
			System.out.print("Do you want to use ATM again? Y/N");
			String res = scan.next();
			
			if (res.equalsIgnoreCase("Y") || res.equalsIgnoreCase("y")) {
				
				tryagain = true;
				System.out.println("");
			}
			else {
				tryagain = false;
				System.out.println("Thank You Using ATM...");
				System.exit(0);
			}
			
		}
		scan.close();

		

	}
	public void withdraw(int amount) {

		if (acc.getBalance() < amount) {
			System.out.println("Insufficient funds. Withdrawal failed.");
		}
		else {
			acc.withdraw(amount);
			System.out.println("Withdrawal successful");
		}
	}
	public void deposit(int amount ) {
		
		acc.deposit(amount);
		System.out.println("Deposit successful");
	}
	public void balanceCheck() {
		
		System.out.println("Current Balance is " + acc.getBalance());
	}
	
	
	
}
