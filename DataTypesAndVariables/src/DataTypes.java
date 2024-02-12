
public class DataTypes {

	public static void main(String[] args) {
		// 1
		int x = 100;
		long y = x;
		System.out.println(y);
		
		
		//2
		long m = 1000;
		int n = (int)m;
		System.out.println(n);
		
		
		//3
		long l =2^35;
		int s = (int)l;
		System.out.println(s);
		
		
		//4
		int a = 10000;
		long b = a;
		System.out.println(b);
		
		
		//5
		long g = 100000;
		int r = (int)g;
		System.out.println(r);
		
		
		//The default value is int in java
		// eg
		long f = 1000000000000000000L;
		System.out.println(f);
		
		
		
		//6
		long o = 10^10L;
		int w = (int)o;
		System.out.println(w);
	}

}
