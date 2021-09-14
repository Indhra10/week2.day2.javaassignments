package week2.day2.assignments;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String numS= "xx111222444";
		char ch1;
		char[] ch=numS.toCharArray();
		int length=ch.length -1;
		 for(int i=0;i<=length;i++)
		 {
			 ch1=ch[i];
			 
			 if(!Character.isDigit(ch1))
			 {
				ch[i]='0';  
			 
			 }
			 
		 }
		String numS1=String.copyValueOf(ch);
		int sum=0; 
		int num=0; 
		int quo;
		int modval=0;
		
		int parseint=Integer.parseInt(numS1);
		System.out.println(parseint);
		
	 while(parseint!=0)
	 {
		quo=parseint/10;
		modval=parseint%10;
		
		sum=sum+modval;
		parseint=quo;
	 }
	 System.out.println(sum);

		
		/*
		 * char[] numA=numS.toCharArray();
		 * 
		 * int leng=numA.length-1;
		 * 
		 * for (int i=0;i<=leng;i++)
		 * 
		 * { ch=numA[i]; // System.out.println(ch);
		 * 
		 * if (Character.isDigit(ch)) { Character.getNumericValue(ch);
		 * 
		 * num=ch; System.out.println(num); } else num=0;
		 * 
		 * sum=sum+num;
		 * 
		 * 
		 * } System.out.println(sum);
		 */
}
}