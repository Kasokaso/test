
public class Testera {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Test test1 = new Test(1,"string 1");
		Test test2 = new Test(1,"string 1");
		
		if( test1.equals(test2) == true)
			System.out.println("Jednaki su");
		else
			System.out.println("Razliciti su");
		
		System.out.println(test1.hashCode());
		System.out.println(test2.hashCode());
		
		test1.setData("xx");
		System.out.println(test1.hashCode());
		System.out.println(test2.hashCode());
		

	}

}
