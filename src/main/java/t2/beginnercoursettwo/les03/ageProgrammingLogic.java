package t2.beginnercoursettwo.les03;

import java.util.Scanner;

public class ageProgrammingLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("what is your age? ");
            int age = scanner.nextInt();

            ageClassification(age);
        } finally {
            scanner.close();
        }
    }

    private static void ageClassification(int age) {
        if (age > 18) {
            System.out.println("You are an adult");
        } else if (age > 10) {
            System.out.println("You are a teenager");
        } else if (age > 2) {
            System.out.println("You are a child");
        } else {
            System.out.println("You are a baby");
        }
    }

}
