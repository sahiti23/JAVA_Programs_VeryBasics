package TDD;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FizzBuzzTest {
    @Test
    public void testFizzBuzz1(){
        String r = Main.fizzbuzz(1);
        assertEquals("1",r);
    }
    @Test
    public void testFizzBuzz3()
    {
        String r = Main.fizzbuzz(3);
        assertEquals("fizz",r);
    }
    @Test
    public void testFizzBuzz2(){
        String r = Main.fizzbuzz(2);
        assertEquals("2",r);
    }
    @Test
    public void testFizzBuzz6(){
        String r = Main.fizzbuzz(6);
        assertEquals("fizz",r);

    }
    @Test
    public void testBuzz10()
    {
        String r = Main.fizzbuzz(10);
        assertEquals("buzz",r);
    }
    @Test
    public void testfizzbuzz15(){
        String r = Main.fizzbuzz(15);
        assertEquals("fizzbuzz",r);
    }
}
