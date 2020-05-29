import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		String a = s1.nextLine();
		Scanner s2= new Scanner(System.in);
		String b = s2.nextLine();
		String output;

		if (a.length() < b.length()) 
			output = a + b + a;
		else
			output = b + a + b;
		
		System.out.println(output);
	}


}
