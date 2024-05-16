import junit.framework.TestCase;

public class FirstTest extends TestCase {

    String actualFarbe = "weiß";
    String excpectedFarbe = "weiß";

    public void testMathOperation() {
        assertEquals(1 + 1, 2);
    }

    public void testMathOperation_2(){
        assertEquals(2 + 2, 4);
    }

    public void testFarbe(){
        assertEquals(actualFarbe, excpectedFarbe);
    }
}