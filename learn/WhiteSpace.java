
public class WhiteSpace {

	public static void main(String[] args) 
	{
		 String str1="This Is The Sentence Without Space";  
         
	        //Removes the white spaces using regex  
	        str1 = str1.replaceAll("\\s+", "");  
	          
	        System.out.println("String after removing all the white spaces : " + str1);  

	}

}
