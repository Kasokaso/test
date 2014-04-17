package test;
public class CloneExample {
 public static void main(String arg[]){
	 
 Employee jwz = new Employee();
 jwz.setName("Jamie Zawinski");
 try {
	 
 Employee joel = (Employee) jwz.clone();
 jwz.setName("Darko Kasalica");
 jwz.setDesignation("bla bla");
 
 System.out.println(joel.getName());
 System.out.println(joel.getDesignation());
 
 } catch (CloneNotSupportedException cnse) {
 System.out.println("Cloneable should be implemented. " + cnse );
 }
 }
}