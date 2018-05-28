package binarysearch;

public class bsearch<T extends Comparable<T>> implements search<T>
{
        T item;
        int loc=-1,i,n,l,f=0,mid;
        T a[]=(T [])new Comparable[10];
    public  void besearch(T t[],int sz)
    {
        n=sz;
        for(i=0;i<n;i++)
        a[i]=t[i];
    }
    public void bisearch(T e)
    {
        item=e;
        f=0;l=a.length-1;
        while(f<=l)
        {
            mid=(f+l)/2;
            if((a[mid].compareTo(item))==0)
            {
                loc=mid;
                break;
            }
            else if((item.compareTo(a[mid]))<0)
                l=mid-1;
            else
                f=mid+1;
        }
    }
    public void display()
    {
        if(loc==-1)
        {
            System.out.println("element is not found");
        }
        else
            System.out.println("exists at"+loc+"position ");
    }
}
