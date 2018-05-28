package bubblesort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bsortdemo
{
    public static void main(String args[])throws IOException
    {
        bubble<Integer> s=new bubble<Integer>();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter no.of elements");
        int n=Integer.parseInt(br.readLine());
        System.out.println(" elements before sorting");
        Integer i[]=new Integer[n];
        for(int j=0;j<n;j++)
            i[j]=Integer.parseInt(br.readLine());
        s.readlist(i,n);
        s.bsort();
        s.display();
    }
}
