package corejava.String;

public class String_BuiltInMethods {

	public static void main(String[] args) {
		String s="SachinTendulkar";
		//1.length()
		int len=s.length();// total length of string
		
		//2.charAt()
		System.out.println("the length of string is = "+len);
		char c=s.charAt(0);  //for specified position the char will print
		System.out.println("the character at 0 postion "+c);
		
		//3.concat()
		String s1=s.concat(" is the best batsman");  // merge the content of 2 String
		System.out.println(s1);
		
		//4. contains()
		boolean res1=s.contains("Ramesh"); //check the substring preset in the main string
		System.out.println(res1);
		
		res1=s.contains("Uamesh"); //check the substring preset in the main string
		System.out.println(res1);

		//5. end with()
		boolean res2=s.endsWith("Tendulkar"); //check the substring preset in the end string
		System.out.println(res2);
		
		res2=s.endsWith("Pendulkar"); //check the substring preset in the end main string
		System.out.println(res2);
		
		//6. startsWith()
		boolean res3=s.startsWith("Tendulkar"); //check the substring preset in the end string
		System.out.println(res3);
		
		res3=s.startsWith("Pendulkar"); //check the substring preset in the end main string
		System.out.println(res2);
		
		//7.getClass
    	Class class1 = s.getClass();//it will provide the root class path of the object
    	System.out.println(class1);
    	
    	//8.hashCode
    	int hashCode = s.hashCode();//it returns the hash value of the given object
    	System.out.println(hashCode);
    	
    	//9.indexOf()
         int index = s.indexOf('S');//it will provide the index of the specified charecter
         System.out.println(index);
         index = s.indexOf('j');//it will provide the index of the specified charecter
         System.out.println(index);

         //10 isBlank
         boolean res4 = s.isBlank();//check if the string is empty or has only blank values
         System.out.println(res4);
         String s2 = "            ";
         boolean res5 = s2.isBlank();//check if the string is empty or has only blank values
         System.out.println(res5);
         String s3 = "";
         boolean res6 = s3.isBlank();//check if the string is empty or has only blank values
         System.out.println(res6);
         
         //11.isEmpty
         boolean res7 = s.isEmpty();//check if the string is empty or has only blank values
         System.out.println(res7);
         String st2 = "            ";
         boolean res8 = st2.isEmpty();//check if the string is empty or has only blank values
         System.out.println(res8);
         String st3 = "";
         boolean res9 = st3.isEmpty();//check if the string is empty or has only blank values
         System.out.println(res9);
         
         //12. lastIndexof()
         int lastIndex=s.lastIndexOf('e'); //it will provide the last occurrence position of specific string
         System.out.println(lastIndex);
         
         lastIndex=s.lastIndexOf('z'); //it will provide the last occurrence position of specific string
         System.out.println(lastIndex);
		
         //13. replace()
         String replace=s.replace('S', '$'); // replace the character into another character
         System.out.println(replace);
         
         //14.substring(int start)
         String subString = s.substring(6);//provides the substring from the specified position
         System.out.println(subString );
         
       //15.substring(int start,int end)
         String subString1 = s.substring(6,12);//provides the substring from the specified position to specified position
         System.out.println(subString1);
 	
         //16.toupperCase
         String uppercase = s.toUpperCase();
         System.out.println( uppercase  );
         
         //17.tolowerCase
         String lowerCase= s.toLowerCase();
         System.out.println( lowerCase  );
         
	}

}
