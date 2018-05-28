package LinearSearch;
import java.io.*;
public class lsearch<T extends Comparable<T>> implements search<T>
{
    T item; int loc=0, i,n;
    T a[]=(T [])new Comparable[20];
    public void besearch(T t[],int sz) throws IOException
    {
        n=sz;
        for(i=0;i<n;i++)
            a[i]=t[i];
    }
    public void lesearch(T e) throws IOException
    {
        item=e;
        for(i=0;i<n;i++) {
            if (item == a[i])
                loc = i;
            else
                loc = -1;
        }
    }
    public void display()
    {
        if(loc==-1)
            System.out.println("element is not found");
        else
            System.out.println(" element exists at " +loc+ " position");
    }
}
