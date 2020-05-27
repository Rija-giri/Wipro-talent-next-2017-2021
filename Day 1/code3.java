//Write a program to accept a number N and print whether the number is EVEN or ODD
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		System.out.println("a=");
		int a= sc.nextInt();
		if(a%2==0)
			System.out.println("a is even");
		else
			System.out.println("a is odd");
	}
}

