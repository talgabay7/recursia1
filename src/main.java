package homework;

public class page26 {
	public static int ex1(int n) {
		if(n==0)
			return 0;
		return n+ex1(n-1);
	}
	public static int ex2(int n) {
		if(n==0)
			return 1;
		return n*ex2(n-1);
	}
	public static int ex3(int n) {
		if(n<=0)
			return 1;
		if(n%2==0) {
			n=n-1;
			return n*ex3(n-2);
		}
		return n*ex3(n-2);
	}
	public static int ex4(int n) {
		if(n==0)
			return 0;
		return 1+ex4(n/10);
	}
	public static int ex5(int n1,int n2) {
		if(n1<=0)
			return 0;
		return 1+ex5(n1-n2,n2);
	}
	public static void main(String[] args) {
		System.out.println(ex1(5));
		System.out.println(ex2(5));
		System.out.println(ex3(6));
		System.out.println(ex4(19832));
		System.out.println(ex5(50,5));
	}

}
