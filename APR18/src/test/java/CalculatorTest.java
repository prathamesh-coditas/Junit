import org.junit.Test;

import static org.junit.Assert.*;
public class CalculatorTest {
    @Test
    public void testAdd(){
        Addition obj_a= new Addition();
        assertEquals (10,obj_a.add(5,5));
    }
    @Test
    public void testSub(){
        Substraction obj_s= new Substraction();
        assertEquals("Success",10,obj_s.sub(20,10));
    }

    @Test
    public void testMul(){
        Multiply obj_m= new Multiply();
        assertEquals(10,obj_m.multiply(5,2));
    }

    @Test
    public void testDiv(){
        Division obj_d= new Division();
        assertEquals("Success",2,obj_d.div(10,5));
    }
}
