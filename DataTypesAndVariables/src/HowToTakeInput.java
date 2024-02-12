import java.util.Scanner;

public class HowToTakeInput {

	public static void main(String[] args) {
		
	//1
	Scanner scn = new Scanner(System.in);
	int x = scn.nextInt();
	System.out.println(x);
	
	
	//2
	Scanner now = new Scanner(System.in);
	int a = now.nextInt();
	int b = now.nextInt();
	System.out.println(a+b);
	}
}
