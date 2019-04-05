package TimBuchalka.javacourse;

import org.junit.Assert;
import org.junit.Test;

import static TimBuchalka.javacourse.AreaCalculator.area;

public class AreaCalculatorTest {

    @Test
    public void smoketest() {
        Assert.assertEquals(78.53975, area(5.0), 5);
    }
}
