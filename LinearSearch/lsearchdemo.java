package LinearSearch;
import java.io.*;
public class lsearchdemo
        {
public static void main(String args[]) throws IOException
        {
        Integer i[]=new Integer[15];
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        lsearch<Integer>l;
        l=new lsearch<Integer>();
        System.out.println("enter how many elements  u want to read");
        int n=Integer.parseInt(br.readLine());
        System.out.println("enter "+n+" elements");
        for(int j=0;j<n;j++)
            i[j]=Integer.parseInt(br.readLine());
        l.besearch(i,n);
        System.out.println("enter the elements u want to search");
        int item=Integer.parseInt(br.readLine());
        l.lesearch(item);
        l.display();
        }
        }
