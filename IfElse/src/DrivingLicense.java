import java.util.Scanner;

public class DrivingLicense {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int age = scn.nextInt(); //15
		
		if (age>=18) {
			System.out.println("eligible");
		}
		
		scn.close();
	}
}
