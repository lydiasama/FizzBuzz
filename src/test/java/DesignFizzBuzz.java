import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(JUnitParamsRunner.class)
public class DesignFizzBuzz {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    @Parameters({
            "1, 1",
            "2, 2",
            "4, 4",
            "7, 7",
            "8, 8",
            "11, 11",
            "13, 13",
            "14, 14"
    })
    public void เลขใดๆที่หารด้วย3และ5ไม่ลงตัวควรได้ตัวมันเอง(int input, String expected) {
        Assert.assertEquals(expected, fizzBuzz.count(input));
    }

    @Test
    @Parameters({
            "3, Fizz",
            "6, Fizz",
            "9, Fizz",
            "12, Fizz"
    })
    public void เลขใดๆที่หารด้วย3ลงตัวควรได้Fizz(int input, String expected) {
        Assert.assertEquals(expected, fizzBuzz.count(input));
    }

    @Test
    @Parameters({
            "5, Buzz",
            "10, Buzz"
    })
    public void เลขใดๆที่หารด้วย5ลงตัวควรได้Buzz(int input, String expected) {
        Assert.assertEquals(expected, fizzBuzz.count(input));
    }

    @Test
    @Parameters({
            "15, FizzBuzz",
            "30, FizzBuzz"
    })
    public void เลขใดๆที่หารด้วย3และ5ลงตัวควรได้FizzBuzz(int input, String expected) {
        Assert.assertEquals(expected, fizzBuzz.count(input));
    }

}
