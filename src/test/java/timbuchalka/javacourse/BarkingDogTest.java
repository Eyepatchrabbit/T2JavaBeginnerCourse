package timbuchalka.javacourse;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static timbuchalka.javacourse.BarkingDog.bark;

public class BarkingDogTest {

    @ParameterizedTest
    @CsvSource(value = {
            //default
            "true, 1, true",
            "false, 2, false",
            "true, 8, false",
            "true, -1, false"})
    public void barkDogTests(boolean barking, int hourOfTheDay, boolean expected) {
        Assert.assertEquals(bark(barking, hourOfTheDay), expected);
    }
}
