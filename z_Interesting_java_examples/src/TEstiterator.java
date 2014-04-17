import java.util.List;
import java.util.ArrayList;


public class TEstiterator {
	
	public static void main(String args[]){
		
		List<String> lista = new ArrayList<>();
		lista.add("a");
		lista.add("b");
		lista.add("c");
		
		for(String s:lista){
			if(s.equals("b"))
				lista.remove(s);
		}
		
		for( String s: lista)
			System.out.println(s);
		
	}

}
