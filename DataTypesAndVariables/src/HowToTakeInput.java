import java.util.Scanner;

public class HowToTakeInput {

	public static void main(String[] args) {
		
	//1
	Scanner scn = new Scanner(System.in);
	int x = scn.nextInt();
	System.out.println(x);
	
	
	//2
	int a = scn.nextInt();
	int b = scn.nextInt();
	System.out.println(a+b);
	
	
	
//	//3 the small s
//	scanner scn = new scanner(System.in);
//	int x = scn.nextInt();
//	System.out.println(x);
	
	scn.close();
	//to close scn
	
	}
}
