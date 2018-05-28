package com.sahiti;
//A simple Calculator to process statements into math operations using Strings
public class Main {

    public static void main(String args[]) {

        String[] statements = {
                "divide 100.0 50.0",  //100.0/50.0 = 2.0
                "Add 10 2", //10 + 2=12
                "Subtract 2 2",
                "Multiply 10 20"
        };
        CalculateHelper helper = new CalculateHelper();
        for (String statement : statements) {
            System.out.println(statement);
            helper.process(statement);
            System.out.println(helper.toString());
        }
    }
}
