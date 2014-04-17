
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
public class Simple {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("5 darko");
        list.add("6 marko");
        list.add("7 farko");
        list.add("1 jarko");
        Collections.sort(list);
        for (String st : list) {
            System.out.println(st);
        }
    }
}