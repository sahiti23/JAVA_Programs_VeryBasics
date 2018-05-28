package selectionsort;

public class ssort<T extends Comparable<T>>implements sort<T>
{
    T c[]=(T [])new Comparable[20];
    int n,minindex;T min;
    public void besort(T t[],int sz)
    {													n=sz;
        for(int i=0;i<sz;i++)
        {
            c[i]=t[i];
        }
    }
    public void afsort()
    {
        T k;
        for(int i=0;i<n;i++)
        {
            minindex=i;
            min=c[i];
            for(int j=i;j<n;j++)
            {
                if(min.compareTo(c[j])>0)
                {
                    min=c[j];
                    minindex=j;
                }
            }
            k=c[minindex];
            c[minindex]=c[i];
            c[i]=k;
        }
    }
    public void display()
    {
        System.out.println("after sorting");

        for(int b=0;b<n;b++)
            System.out.println(c[b]);
    }
}
