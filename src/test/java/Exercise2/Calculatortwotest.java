package Exercise2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Calculatortwotest {

    Calculatortwo calc=new Calculatortwo();
    @Test
    public void testAdd(){
        assertEquals(4,calc.add(2,2));
    }
    @Test
    public void testMultiply(){
        assertEquals(4,calc.multiply(2,2));
    }
    @Test
    public void testSubtract(){
        assertEquals(1,calc.subtract(2,1));
    }
    @Test
    public void testDivide(){
        assertEquals(2,calc.divide(6,3));
    }
    @Test(expected = ArithmeticException.class)
    public void testByZero(){
        calc.divide(5,0);
    }
}
