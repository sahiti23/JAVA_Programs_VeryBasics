package strings;
import java.util.HashMap;

public class DuplicateStringCount {


    static void findCount(String str) {
        HashMap<String, Integer> hm = new HashMap<>();
        String arr[] = str.split(" ");
        for (String s : arr) {
            if (hm.containsKey(s)) {
                hm.put(s, hm.get(s) + 1);
            } else
                hm.put(s, 1);
        }
        System.out.println(hm);
    }

    public static void main(String args[]){
        findCount("I am am am studying java java java ja");
    }
}
