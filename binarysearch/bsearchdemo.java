package binarysearch;
import java.io.*;
public class bsearchdemo
{
    public static void main(String args[]) throws IOException
    {
        Integer i[]=new Integer[15];
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter  how many elements you want to read");
        int n=Integer.parseInt(br.readLine());
        bsearch<Integer>b;
        b=new bsearch<Integer>();
        System.out.println("enter the elements");
        for(int j=0;j<n;j++)
            i[j]=Integer.parseInt(br.readLine());
        b.besearch(i,n);
        System.out.println("enter the element you want to search");
        int item=Integer.parseInt(br.readLine());
        b.bisearch(item);
        b.display();
    }
}

