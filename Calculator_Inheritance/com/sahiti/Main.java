package com.sahiti;

public class Main {

    public static void main(String args[])
    {
        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('d', 100.0d, 50.0d);
        equations[1] = new MathEquation('a', 35.0d, 90.0d);
        equations[2] = new MathEquation('s',123.0d, 12.0d);
        equations[3] = new MathEquation('m', 2.0d, 3.0d);

        System.out.println("using inheritance");

        CalculateBase[] calculators = {
                new Adder(100,200),
                new Divider(12,4),
                new Subtractor(123,120),
                new Multiplier(122,9)
        };
        for(CalculateBase calculator:calculators)
        {
            calculator.Calculate();
            System.out.println("result is "+" "+calculator.getResult());
        }

    }
}
