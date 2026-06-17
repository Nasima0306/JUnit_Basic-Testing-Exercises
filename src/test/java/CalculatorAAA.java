import Exercise4.Calculatorthree;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorAAA {
    Calculatorthree calc;

    @Before
    public void setUp(){
        System.out.println("Setting up....");
        calc=new Calculatorthree();
    }
    @After
    public void tearDown(){
        System.out.println("setting down");
        calc=null;
    }
    @Test
    public void TestAdd(){
        int a=2;
        int b=3;
        int res=calc.add(a,b);
        assertEquals(5,res);

    }
    @Test
    public void testMultiply(){
        int a=5;
        int b=5;
        int res=calc.multiply(a,b);
        assertEquals(25,res);
    }
}
