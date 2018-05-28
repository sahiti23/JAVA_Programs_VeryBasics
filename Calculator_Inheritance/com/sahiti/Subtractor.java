package com.sahiti;

public class Subtractor extends CalculateBase {
    public Subtractor(){ }
    public Subtractor(double leftVal, double rightVal)
    {
        super(leftVal,rightVal);
    }
    @Override
    public void Calculate()
    {
        double value = getLeftVal() - getRightVal();
        setResult(value);
    }
}
