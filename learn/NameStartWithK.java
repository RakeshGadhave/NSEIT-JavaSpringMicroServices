import java.util.function.Predicate;
public class NameStartWithK {
	 public static void main(String[] args)
	    {
	       String[] names={"Komal","Anvish","Kanta","Mrunal","Karnik","Addy","Kirti"};
	     Predicate<String> starstwithk=s->s.charAt(0)=='k';
	     System.out.println("The NameStart With K Are ;");
	     for(String S:names)
	        {
	            if(starstwithk.test(S))
	            {
	                System.out.println(S);
	            }
	                
	        }
	    }

}
