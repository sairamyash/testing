package demopack;

public class DupliCharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = " shimakh technology";
		
		char[] carray = str.toCharArray();
		
		System.out.println("The string is:  " + str);
		System.out.println("Duplicate Characters in above string are: ");
		
		for (int i =0; i < str.length(); i++) {
			
		   for(int j = i + 1; j < str.length(); j++) {
			   
			  if (carray[i] == carray[j]) {
				  
				  System.out.println(carray[j] +" ");
				  break;
				   
			   }
				
				
			}
		}

	}

}
