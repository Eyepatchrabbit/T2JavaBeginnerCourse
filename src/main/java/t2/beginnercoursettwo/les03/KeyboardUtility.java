package t2.beginnercoursettwo.les03;

import java.util.Scanner;

public class KeyboardUtility {

    Scanner scanner;

    public static int vraagGetalOp() {
        Scanner scanner = new Scanner(System.in);
        //TODO: see to make try finally=>got each time nosuchelementexception for some reason
        System.out.print("Geef een getal in: ");
        int getal = Integer.parseInt(scanner.nextLine());

        return getal;
    }

}
