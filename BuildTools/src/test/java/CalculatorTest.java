import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAddition(){
        int result = Calculator.add(5,5);
        Assert.assertEquals(10, result);
    }

    @Test
    public void testSubtraction(){
        // Test: 10 - 4 = 6
        int result = Calculator.sub(10, 4);
        Assert.assertEquals(6, result);
    }
}
