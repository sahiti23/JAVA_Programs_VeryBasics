package com.sahiti;

public class MathEquation {
    private double leftval;
    private double rightval;
    private char opcode ='a';
    private double result;

    public double getLeftval(){ return leftval; }
    public void setLeftval(double leftval) {this.leftval = leftval;}

    public double getRightval() {
        return rightval;
    }
    public void setRightval(double rightval){
        this.rightval =rightval;
    }

    public char getOpcode() {
        return opcode;
    }
    public void setOpcode(char opcode)
    {
        this.opcode = opcode;
    }
    public double getResult(){
        return result;
    }
    public MathEquation(){ }
    public MathEquation(char opcode){this.opcode = opcode;}
    public MathEquation(char opcode, double leftval, double rightval){
        this(opcode);
        this.leftval=leftval;
        this.rightval=rightval;
    }



}
