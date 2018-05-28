package strings;

public class StringEquality {
    public static void main(String args[]){
        String str1=new String("hello");
        String str2=new String("hello");

        if(str1==str2)
            System.out.println("same");
        else
            System.out.println("different");


        if(str1.equals(str2))
            System.out.println("same");
        else
            System.out.println("different");

        String str3="hello hi";
        if(str1.compareTo(str3)>0)
            System.out.println("hello is more");
        else
            System.out.println("hello hi is more");

        if(str1.compareTo(str2)==0)
            System.out.println("same");
        else
            System.out.println("different");
    }
}
