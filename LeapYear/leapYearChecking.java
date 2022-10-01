import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class leapYearChecking{
    //test 1 - 5 for BVC test
    @Test
    public void test01(){
        leapChecking basecase = new leapChecking();
      boolean result = basecase.leapcheck(1990);
      assertEquals(false, result);
    }

    @Test
    public void test02(){
        leapChecking basecase = new leapChecking();
      boolean result = basecase.leapcheck(1991);
      assertEquals(false, result);
    }

    @Test
    public void test03(){
        leapChecking basecase = new leapChecking();
      boolean result = basecase.leapcheck(1990);
      assertEquals(false, result);
    }

    @Test
    public void test04(){
        leapChecking basecase = new leapChecking();
      boolean result = basecase.leapcheck(2021);
      assertEquals(false, result);
    }

    @Test
    public void test05(){
        leapChecking basecase = new leapChecking();
      boolean result = basecase.leapcheck(2022);
      assertEquals(false, result);
    }


    //test 6 and 7 for Robust test
    @Test
    public void test06(){
        leapChecking basecase = new leapChecking();
      boolean result = basecase.leapcheck(1989);
      assertEquals(false, result);
    }

    @Test
    public void test07(){
        leapChecking basecase = new leapChecking();
      boolean result = basecase.leapcheck(2023);
      assertEquals(false, result);
    }
}