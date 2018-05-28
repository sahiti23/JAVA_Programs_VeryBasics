package selectionsort;
import java.io.*;
public class sortdemo
{
    public static void main(String args[])throws IOException
    {
        ssort<Integer>s=new ssort<Integer>();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter no.of elements");
        int n=Integer.parseInt(br.readLine());
        System.out.println(" elements before sorting");
        Integer i[]=new Integer[n];
        for(int j=0;j<n;j++)
            i[j]=Integer.parseInt(br.readLine());
        s.besort(i,n);
        s.afsort();
        s.display();
    }
}
