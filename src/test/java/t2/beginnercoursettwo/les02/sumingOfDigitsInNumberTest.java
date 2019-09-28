package t2.beginnercoursettwo.les02;

import t2.beginnercoursettwo.les02.homework.sumingOfDigitsInNumber;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class sumingOfDigitsInNumberTest extends sumingOfDigitsInNumber {
    //    maak een applicatie waarbij je een getal tussen 0 en 10000 ingeeft,
    //    de cijfers can het getal optelt en resultaat afdrukt
//    public static void main(String[] args) {
//        sumOfDigitsInNumber(1);
//        sumOfDigitsInNumber(2000);
//        sumOfDigitsInNumber(2001);
//        sumOfDigitsInNumber(2143);
//
//    }

    @ParameterizedTest
    @CsvSource(value = {
            //default
            "1, 1",
            "2000,2",
            "2001,3",
            "2143,10"
    })
    public void  tesingSummer(int numberstoSum, int expectedResult){
        assertEquals(sumOfDigitsInNumber(numberstoSum),expectedResult);
    }




}