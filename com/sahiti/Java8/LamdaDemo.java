package com.sahiti.Java8;

interface Car
{
    void drive(String name);
}
/*
class Honda implements Car
{
    public void drive(Object obj)
    {
        System.out.println("This is a "+obj.getClass().getSimpleName()+" Car");
    }
} */

public  class LamdaDemo{

    public static void main(String args[])
    {
        Car obj = (name -> System.out.println("This is a "+name+" Car."));
        obj.drive("Honda");
    }
}
