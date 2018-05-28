package strings;

import java.util.HashMap;
import java.util.Map;

public class RepeatedCharacters {

    public static void repeat(String str){

        HashMap<String, Integer> hm = new HashMap<>();
        String sarr[] = str.split("");

        for(String s: sarr){
            if(hm.containsKey(s))
                hm.put(s,hm.get(s)+1);
            else
                hm.put(s,1);
        }
        System.out.println(hm);

        for(Map.Entry<String, Integer> hm1 : hm.entrySet())
        {
            if(hm1.getValue()>1)
                System.out.println(hm1);
        }
    }
    public static void main(String args[]){
        repeat("AAABBDCEE");
    }
}
