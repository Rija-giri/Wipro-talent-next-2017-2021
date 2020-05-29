//Program to add last digit of 2 given numbers
import java.util.*;
public class SumLastDigit {
    	public static void main(String[] args){
        	int a,b,l;
        	System.out.println("Enter a number ");  //input1
        	Scanner sc=new Scanner(System.in);
        	a=sc.nextInt();
        	System.out.println("Enter a number ");  //input2
        	Scanner sc1=new Scanner(System.in);
        	b=sc1.nextInt();
        	if(a<0)             //positiveToNegative
            		a=(~(a-1));     
        	elif(b<0)
			b=(~(b-1));
		System.out.println("Sum of last digit of given 2 numbers is "+addlastdigit(a,b)); 
	}  
	static int addlastdigit(int a,int b) {
		int i,j,result;
		i=a%10;
		j=b%10;
		result=i+j;
		return result;
	}
}
