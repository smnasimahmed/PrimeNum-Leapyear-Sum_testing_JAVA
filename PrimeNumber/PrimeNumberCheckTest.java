import static org.junit.Assert.assertEquals;
import org.junit.Test;



public class PrimeNumberCheckTest {
    // test case 01 - 05 are BVC Testing
    @Test
    public void test01(){
        primeCheckFunc basecase = new primeCheckFunc();
        boolean result = basecase.pncheck(1);
        assertEquals(false, result);
    }

    @Test
    public void test02(){
        primeCheckFunc basecase = new primeCheckFunc();
        boolean result = basecase.pncheck(2);
        assertEquals(false, result);
    }

    @Test
    public void test03(){
        primeCheckFunc basecase = new primeCheckFunc();
        boolean result = basecase.pncheck(50);
        assertEquals(true, result);
    }

    @Test
    public void test04(){
        primeCheckFunc basecase = new primeCheckFunc();
        boolean result = basecase.pncheck(99);
        assertEquals(true, result);
    }

    @Test
    public void test05(){
        primeCheckFunc basecase = new primeCheckFunc();
        boolean result = basecase.pncheck(100);
        assertEquals(true, result);
    }

    // test 06 and 07 are Robust testing
    @Test
    public void test06(){
        primeCheckFunc basecase = new primeCheckFunc();
        boolean result = basecase.pncheck(-50);
        assertEquals(true, result);
    }

    @Test
    public void test07(){
        primeCheckFunc basecase = new primeCheckFunc();
        boolean result = basecase.pncheck(110);
        assertEquals(true, result);
    }

}
