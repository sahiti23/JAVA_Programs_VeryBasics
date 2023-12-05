package com.sahiti.Java8;

interface Phone
{
    void call();
    default void message()
    {
        System.out.println("hello");
    }
}

class AndroidPhone implements Phone
{
    public void call()
    {
        System.out.println("Calling");
    }

}
public class DemoInterface {

    public static void main(String args[])
    {
        Phone phone = new AndroidPhone();
        phone.call();
    }
}
