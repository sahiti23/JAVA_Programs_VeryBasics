package com.sahiti.Java8;

import java.util.List;
import java.util.Arrays;

public class DemoForEach
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(10,2,4,7,9,13,5,7980);

        //External Loops

        //Normal For Loop
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }

        //Enhanced For loop
        for(int j:list)
        {
            System.out.println(j);
        }

        //Internal Loops
        list.forEach(i -> System.out.println(i)); // Lamda expression // Consumer interface --> functional interface.

    }

}
