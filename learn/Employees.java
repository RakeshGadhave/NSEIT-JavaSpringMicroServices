import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
public class Employees {
	String name;
	 double salary;
	 Employees(String name, double salary) {
	  this.name = name;
	  this.salary = salary;
	 }
	 
	 @Override
	 public String toString() {
	  return "{name=" + name + ", salary=" + salary + "}";
	 }
	}
	public class Test {
	 public static void main(String... args) {
	  ArrayList<Employees> i = new ArrayList<Employees>();
	  populate(i);
	  
	  System.out.println("Before Increment :");
	  System.out.println(i);
	  
	  Predicate<Employees> p = e -> e.salary < 4000;
	  Function<Employees, Employees> f = e -> {
	   e.salary += 500;
	   return e;
	  };
	  
	  ArrayList<Employees> i2 = new ArrayList<Employees>();
	  for(Employees e : i) {
	   if(p.test(e)) {
	    i2.add(f.apply(e));
	   }
	  }
	  
	  System.out.println("After Increment :");
	  System.out.println(i);
	  
	  System.out.println("Employees with incremented salary :");
	  System.out.println(i2);
	 }
	 
	 public static void populate(ArrayList<Employees> i) {
	  i.add(new Employees("Satish", 1500));
	  i.add(new Employees("Nilesh", 4000));
	  i.add(new Employees("Amish", 3500));
	  i.add(new Employees("Shubham", 2000));
	  i.add(new Employees("Pawan", 5000));
	  i.add(new Employees("Yogesh", 3000));
	 }
	}
