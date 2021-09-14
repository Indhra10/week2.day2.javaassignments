package week2.day2.assignments;

public class ReverseStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
				String test = "feeling good";

				// Build the logic to find the count of each
				/* Pseudo Code: 1
					a) Convert the String to character array
					b) Traverse through each character (using loop in reverse direction)
					c) Print the character (without newline -> like below
					   System.out.print(ch);
				*/

				 char[] ch=test.toCharArray();
				 int len=ch.length-1;
				 char ch1;
				 
				 for(int i=len;i>=0;i--)
				 {
					 System.out.print(ch[i]);
				 }
				
				/* Pseudo Code: 2
				a) Find the length of the string
				b) Traverse through each index from length-1 -> 0 (using loop in reverse direction)
				c) Find the character of the String using its index
				*/
					 
				 for(int i=len;i>=0;i--)
				 {
					 ch1=ch[i];
					 
					 if(Character.isAlphabetic(ch1))
					 
						 System.out.println(ch1+ "is a character" );
					 
					 else
						 System.out.println(ch1+ "is not a character");
						 
					 }
				 
				 
				 
	}

}
