package week2.day2.assignments;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "We learn java basics as part of java sessions in java week1";
        int count=0;
		String[] str1=text.split(" ");
		String str2,str3,text1=" ";
		for(int i=0;i<str1.length;i++)
		{
			
			str2=str1[i];
			
			System.out.println(str2);
			for(int j=i+1;j<str1.length;j++)
			{
				count=0;
				str3=str1[j];
			 if (str2.equals(str3))
				{
					count++;
				//	System.out.println(count);
				if(count>0)
					
					str1[j]="";
				
				}
		//	 text1=text1.concat(str1[j]);
			 
			 
			 
			}
			
						}
		
		
		
		

			 
		}
		   
			   
	}


