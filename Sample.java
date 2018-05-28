import static java.lang.System.exit;

public class Sample {
   public static void main(String args[]) {

      /* if(n % 3 == 0)
           System.out.println("fizz");
       else if( n % 5 == 0)
           System.out.println("buzz"); */
           for (int i = 1; i <= 100; i++) {
               // System.out.println(i);
               if (i % 5 == 0 && i % 3 == 0) {

                   System.out.println("fizzbuzz"); //15

               } else if (i % 3 == 0)
                   System.out.println("fizz");
               else if (i % 5 == 0)
                   System.out.println("buzz");
               else
                   System.out.println(i);

           }
       }
     /*  else
            System.out.println(n); */



}
