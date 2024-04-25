import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
		
		double totalMarks = 0;
		double averageMarks;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the Number of Total Subject:");
		int noSubject = scan.nextInt();
		System.out.println("");
		
		System.out.println("Entyer the Marks for Each Subject...");
		for (int i = 1; i <=noSubject; i++) {
			
			System.out.println("Subject " + i + " : ");
			double marks = scan.nextDouble();
			
			if (!(marks > 100) && !(marks < 0)) {
				
				totalMarks+=marks;
			}
			else {
				
				System.out.println("Invalid Marks!!!");
			}
		}
		
		scan.close();
		
		averageMarks = totalMarks / noSubject;
		
		if (averageMarks >= 75 ) {
			
			System.out.println("Grade A");
		}
		else if (averageMarks >= 65) {
			
			System.out.println("Grade B");
		}
		else if (averageMarks >= 50) {
			
			System.out.println("Grade C");
		}
		else if (averageMarks >= 35) {
			
			System.out.println("Grade S");
		}
		else {
			System.out.println("Grade F");
		}
		
	}

}
