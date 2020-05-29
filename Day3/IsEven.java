//Check whether the given number is even or not
import java.util.*;
public class IsEven {
	public static void main(String[] args) {
		System.out.println("Enter a number");   //input
		Scanner sc= new Scanner(System.in); 
		int n= sc.nextInt();
		System.out.println(even(n));
	}
	static int even(int n) {
		int result;
		if(n%2==0)
			result=2;
		else
			result=1;
		return result;
	}
}
