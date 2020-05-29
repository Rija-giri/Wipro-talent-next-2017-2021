//Program to print last digit of a given number
import java.util.*;
public class LastDigitOfNo {    
	public static void main(String[] args){
		int n,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");     
		n=sc.nextInt();
		temp=n%10;
		if (n<0) {
			temp=(~(temp-1));
			System.out.println("The last digit of a given number is "+temp);
	        }
		else 
			System.out.println("The last digit of a given number is "+temp);
	}
}
