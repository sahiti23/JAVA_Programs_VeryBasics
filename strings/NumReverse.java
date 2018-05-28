package strings;

public class NumReverse {
    public static void main(String args[]){
       System.out.println(reverse(12345));
    }
    public static int reverse(int n){
        int r=0;
        while(n!=0){
            r = r*10 + n%10;
            n = n/10;
        }
      return r;
    }
}
