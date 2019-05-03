package beginnercoursettwo.les03;


import java.util.Scanner;

public class ScrabbleSwitch {

    /**
     *
     */

    public static void main(String[] args) {
        //teruggave van de waarde van de letter => use a switch statement
        Scanner inputKeyboard = new Scanner(System.in);

        try {
            System.out.println("Give in a letter");
            String letter = inputKeyboard.next();

            char characterUsed = letter.toLowerCase().charAt(0);
            int basevalue = letterValue(characterUsed);


            System.out.println("Give in a location");
            String locationGiven = inputKeyboard.next().toUpperCase();
            int locationMultilier = valueMultiplier(locationGiven);


            System.out.println("With letter " + characterUsed + ", at place" + locationGiven + " we get: \n"
                    + "basevalue (" + basevalue + ") * location (" + locationMultilier + ") = " + (basevalue * locationMultilier));

        } finally {
            inputKeyboard.close();
        }


    }


    private static int letterValue(char letter) {

        switch (letter) {
            case 'a':
                return 1;
            case 'b':
                return 3;
            case 'c':
                return 5;
            case 'd':
                return 2;
            case 'e':
                return 1;
            case 'f':
                return 4;
            case 'g':
                return 3;
            case 'h':
                return 4;
            case 'i':
                return 1;
            case 'j':
                return 4;
            case 'k':
                return 3;
            case 'r':
                return 10;
            case 's':
                return 2;
            case 't':
                return 2;
            case 'u':
                return 4;
            case 'v':
                return 4;
            case 'w':
                return 5;
            case 'x':
                return 8;
            case 'y':
                return 8;
            case 'z':
                return 4;
            default:
                return 0;

        }

    }

    private static int valueMultiplier(final String coordinates) {
        String[] tripler = {
                "A1", "H1", "O1",
                "F2", "J2",
                "B6", "F6", "J6", "N6",
                "A8", "O8",
                "B10", "F10", "J10", "N10",
                "F14", "J14",
                "A15", "H15", "O15"
        };

        String[] doubler = {
                "D1", "L1",
                "B2", "N2",
                "C3", "G3", "I3", "M3",
                "A4", "D4", "H4", "L4", "O4",
                "E5", "K5",
                "C7", "G7", "I7", "M7",
                "D8", "H8", "L8",
                "C9", "G9", "I9", "M9",
                "E11", "K11",
                "A12", "D12", "H12", "L12", "O12",
                "C13", "G13", "I13", "M13",
                "B14", "N14",
                "D15", "L15"

        };

        if (arrayContainsValue(tripler, coordinates)) {
            return 3;
        } else if (arrayContainsValue(doubler, coordinates)) {
            return 2;
        }

        return 1;
    }

    private static boolean arrayContainsValue(String[] arrayCoordinates, String coordinate) {
        for (String location : arrayCoordinates) {
            if (location.equals(coordinate)) {
                return true;
            }
        }


        return false;
    }
}
