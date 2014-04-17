
public class StingSplit {
	
	public static void main(String args[]){
		
		String a = "32";
		
		int b = 0;
		try {
			b = Integer.valueOf(a);
		}catch (NumberFormatException e){
			System.out.println("Desila se greska pri parsiranju.");
		}
		System.out.println(b);
	}

}
