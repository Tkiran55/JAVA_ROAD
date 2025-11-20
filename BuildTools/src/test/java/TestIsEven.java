import org.junit.Assert;
import org.junit.Test;

public class TestIsEven {

    private JunitTestExe ie = new JunitTestExe();
    @Test
    public void testIsEven(){
        int evenNumber = 4;
        boolean result = ie.isEven(evenNumber);

        Assert.assertTrue("Test success: 4 should be identified as even " ,result);




    }
}
