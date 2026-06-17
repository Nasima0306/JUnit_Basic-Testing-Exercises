package Exercise1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void test(){
        Calculator c=new Calculator();
        int result=c.add(2,3);
        assertEquals(5,result);

    }
}
