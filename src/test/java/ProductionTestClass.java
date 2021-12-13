import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductionTestClass {

    @Test
    public void shouldReturnValue1(){
        long expected = 24;
        long result = Production.getOutcomes(1,4);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void shouldReturnValue2(){
        long expected = 0;
        long result = Production.getOutcomes(0,1);
        Assert.assertEquals(result, expected);
    }
    @Test
    public void shouldReturnValue3(){
        long expected = 2;
        long result = Production.getOutcomes(2,2);
        Assert.assertEquals(result, expected);
    }
}
