package strings;
/*
{Sahiti} 12
sahiti
 ahiti
  hiti
   iti
    ti
     i
 */

public class StringDemo {

    int num1; String name;
    public static void main(String[] args)
    {
        StringDemo s = new StringDemo(12,"Sahiti");
        System.out.println(s);

        String pattern ="sahiti";

        for(int i=0;i<pattern.length();i++)
        {
            for(int j=0;j<pattern.length();j++)
            {
                if(i>j)
                    System.out.print(" ");
                else
                    System.out.print(pattern.charAt(j));
            }
            System.out.println();
        }

        for(int i=1;i<5;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=1;i<5;i++)
        {

            for(int k=3;k>=i;k--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public StringDemo(int num1, String name)
    {
        this.num1= num1;
        this.name=name;
    }
    public String toString(){
        return "{"+name+"}"+" "+num1;
    }
}
