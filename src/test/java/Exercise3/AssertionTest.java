package Exercise3;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertionTest {
    @Test
    public void testAssertions(){
        assertEquals(5,2+3);
        assertTrue(5>3);
        assertFalse(3>5);
        String str=null;
        assertNull(str);
        Object obj=new Object();
        assertNotNull(obj);
        Object obj1=obj;
        assertSame(obj,obj1);
        Object obj2=new Object();
        assertNotSame(obj,obj2);
    }
}
