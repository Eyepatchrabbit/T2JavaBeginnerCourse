package t2course.gevorderdencursusttwo.beginnercoursettwo.les02;

import org.junit.Assert;
import org.junit.Test;
import t2.beginnercoursettwo.les02.homework.BmiCalculation;


public class BmiCalculationTest extends BmiCalculation {

    @Test
    public void tesingBmiCalculator() {
        bmiCalculator(80.0, 1.8);
        Assert.assertEquals(24.69, bmiCalculator(80.0, 1.8), 2);
    }


}
