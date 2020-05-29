import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str= s.nextLine();
		
		String output;
		
		if (str.length() % 2 == 0) {
			output = str.substring(0, str.length() / 2);
		} else {
			output = null;
		}
		
		System.out.println(output);
	}

}
