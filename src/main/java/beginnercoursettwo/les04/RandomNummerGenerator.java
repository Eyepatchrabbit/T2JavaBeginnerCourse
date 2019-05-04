package beginnercoursettwo.les04;

import java.util.Random;

public class RandomNummerGenerator {

    public static void main(String[] args) {
        Random randomNummerGenerator= new Random();

        for (int randomNumberPrinted=0;randomNumberPrinted < 10; randomNumberPrinted++){
            System.out.println(randomNummerGenerator.nextInt(151));
        }
    }
}
