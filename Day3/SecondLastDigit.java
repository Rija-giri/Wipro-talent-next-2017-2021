    //Program to print 2nd last digit of a given number
    


import java.util.*;



public class SecondLastDigit {
  
  
	public static void main(String[] args){
        
		int n,l;
        
		Scanner sc=new Scanner(System.in);
  
		System.out.println("Enter a number ");      
		n=sc.nextInt();
        
		if (n<0) 
            
			n=(~(n-1));     //positiveToNegative
        
		l=String.valueOf(n).length();
        
		System.out.println(digit(n,l)); 
    
	}    
    
	
	static int digit(int n,int l) {
        
		int c;
        
		if(l>1) {
            
			int i,temp;
            
			i=n%100;
            
			temp=i/10;
            
			System.out.println("The 2nd last digit of a given number is ");
            
			c=temp;
        
		} 
        
		else
            
			c=-1;
        
		return c;
    
	}

}