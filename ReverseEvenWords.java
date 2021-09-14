package week2.day2.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		String s1= "my life my rules";
		char[] st1;
		String[] spl=s1.split(" ");
	     
		for (int i = 0; i < spl.length; i++) { 
			if(i%2==1)
			{
			st1=spl[i].toCharArray();
			
			 for (int  j = st1.length-1;j >= 0; j--) {
				 
				System.out.print(st1[j]); 
				
			}
			}
			else
				
			System.out.print(spl[i]);
			
		}
		
	

	}

}
