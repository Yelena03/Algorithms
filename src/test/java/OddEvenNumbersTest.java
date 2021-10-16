import org.junit.Assert;
import org.junit.Test;

public class OddEvenNumbersTest {

    @Test
    public void testOddEvenNumbers() {

        String expectedResult = "Even";

        OddEvenNumbers number = new OddEvenNumbers();
        String actualResult = number.oddEvenNumbers(2147483647 + 1);

        Assert.assertEquals(expectedResult, actualResult);
    }

}
