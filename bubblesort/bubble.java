package bubblesort;

public class bubble<T extends Comparable<T>> implements sort<T>
{
    T c[]=(T[])new Comparable[20];
    int n;
    public void readlist(T t[],int sz)
    {
        n=sz;
        for(int i=0;i<n;i++)
        {
            c[i]= t[i];
        }
    }
    public void bsort()
    {
        T k;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n-i;j++)
            {
                if(c[j-1].compareTo(c[j])>0)
                {													 k=c[j-1];
                    c[j-1]=c[j];
                    c[j]=k;
                }
            }
        }
    }
    public void display()
    {
        System.out.println("after sorting");
        for(int b=0;b<n;b++)
            System.out.println(c[b]);
    }
}
