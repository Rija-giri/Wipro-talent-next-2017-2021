	//Remove Duplicate Characters from a string

import java.util.*;

public 

class RemoveDuplicateStrChar {

	public static void main(String[] args) { 
		 
		
		Scanner myObj=new Scanner(System.in);
		
		String str=myObj.nextLine();
		
		str=str.toLowerCase();
		
		int n = str.length();
		
		char[] ch = new char[n]; 
  
        // Copy character by character into array 
        
		for (int i = 0; i < str.length(); i++) { 
            
			ch[i] = str.charAt(i); 
        
		} 
		
		System.out.println(removeDuplicate(ch, n)); 
	
	} 

	static String removeDuplicate(char str[], int n) { 
	// Used as index in the modified string 
		
	int index = 0; 
		// Traverse through all characters 
		
	for (int i=0;i<n;i++) {
			// Check if str[i] is present before it 

		int j; 
			
		for (j=0;j<i;j++) { 
				
			if (str[i]==str[j]) { 
				break; 
			} 
			
		} 
			// If not present, then add it to result. 
			
		if (j == i) { 
				
			str[index++] = str[i]; 
			
		} 
		
	} 
		
	return String.valueOf(Arrays.copyOf(str, index)); 
	
	} 

	

}
