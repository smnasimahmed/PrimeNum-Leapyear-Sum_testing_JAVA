import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumTest {
    // Here we are setting value for A(1-10) and for B(1-10)
    // From here we started BVC Testing for two variable

    //A normal, B minimum
    @Test
    public void TestSum01(){
        Sum sum = new Sum();
        float result = sum.calculate(5,1);
        assertEquals(1.584893, result, .10);

    }

    //A normal, B minimum +
    @Test
    public void TestSum02(){
        Sum sum = new Sum();
        float result = sum.calculate(5,2);
        assertEquals(1.71877193, result, .10);

    }

    //A normal, B maximum
    @Test
    public void TestSum03(){
        Sum sum = new Sum();
        float result = sum.calculate(5,10);
        assertEquals(2.2679331, result, .10);

    }

    //A normal, B maximum -
    @Test
    public void TestSum04(){
        Sum sum = new Sum();
        float result = sum.calculate(5,9);
        assertEquals(2.2679331, result, .10);

    }

    //A minimum, B normal
    @Test
    public void TestSum05(){
        Sum sum = new Sum();
        float result = sum.calculate(1,5);
        assertEquals(1.9186452, result, .10);

    }
    //A minimum + , B normal
    @Test
    public void TestSum06(){
        Sum sum = new Sum();
        float result = sum.calculate(2,5);
        assertEquals(1.93318212, result, .10);
    }

    //A maximum , B normal
    @Test
    public void TestSum07(){
        Sum sum = new Sum();
        float result = sum.calculate(10,5);
        assertEquals(2.036168, result, .10);
    }

    //A maximum - , B normal
    @Test
    public void TestSum08(){
        Sum sum = new Sum();
        float result = sum.calculate(9,5);
        assertEquals(2.02439737, result, .10);
    }

    // A normal , B normal
    @Test
    public void TestSum09(){
        Sum sum = new Sum();
        float result = sum.calculate(5,5);
        assertEquals(1.9743504, result, .10);
    }




    // From here we started BVC Testing for two variable

    // A maximum + , B normal
    @Test
    public void TestSum10(){
        Sum sum = new Sum();
        float result = sum.calculate(11,5);
        assertEquals(1.9743504, result, .10);
    }

    // A minimum -  , B normal
    @Test
    public void TestSum11(){
        Sum sum = new Sum();
        float result = sum.calculate(0,5);
        assertEquals(1.9743504, result, .10);
    }

    // A normal , B maximum +
    @Test
    public void TestSum12(){
        Sum sum = new Sum();
        float result = sum.calculate(5,11);
        assertEquals(2.2679331, result, .10);
    }

    // A normal , B minimum -
    @Test
    public void TestSum13(){
        Sum sum = new Sum();
        float result = sum.calculate(5,0);
        assertEquals(1.3797296, result, .10);
    }


}