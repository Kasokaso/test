import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	
    static List<String> list = new ArrayList<>();
	private static Scanner in;

	public static void main(String[] args) {
		
		Main main = new Main();
		in = new Scanner(System.in);
		
		for(short i=0; i<5; i++)
			main.addToList(in.nextLine());
		
		Comparator<String> comparator = new Comparator<String>() {
		    public int compare(String s1, String s2) {
		        return Integer.valueOf(s1.substring(0, s1.indexOf(" "))).compareTo(
		        		Integer.valueOf(s2.substring(0, s2.indexOf(" "))));
		    }
		};
		
		Collections.sort(list,comparator);
			
		
		for(String line: list)
			System.out.println(line);
		
	}
	
	private void addToList(String line) {
		
		if(line != null && !line.equals(""))
			list.add(line);
	}
}