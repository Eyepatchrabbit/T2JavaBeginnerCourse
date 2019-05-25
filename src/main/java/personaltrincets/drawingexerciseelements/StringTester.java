package personaltrincets.drawingexerciseelements;

public class StringTester {
    public static void main(String[] args) {
        String stringToTestOn = "ICT Software Test Engeneer";

        System.out.println("original:\t" + stringToTestOn);

        System.out.println("substring(4):\t" + stringToTestOn.substring(4));
        System.out.println("substring(13, 17):\t" + stringToTestOn.substring(13, 17));

        System.out.println("stringToTestOn.charAt(2):\t" + stringToTestOn.charAt(2));
        System.out.println("(int) stringToTestOn.charAt(2):\t" + (int) stringToTestOn.charAt(2));   //gives the ascii waarde van een char

        System.out.println("indexOf(\"Test\"):\t" + stringToTestOn.indexOf("Test"));
        System.out.println("indexOf(\"test\"):\t" + stringToTestOn.indexOf("test"));

        System.out.println("toUpperCase():\t" + stringToTestOn.toUpperCase());
        System.out.println("toLowerCase():\t" + stringToTestOn.toLowerCase());

        System.out.println("contains(\"Engeneer\"): "+stringToTestOn.contains("Engeneer"));
        System.out.println("contains(\"engeneer\"): "+stringToTestOn.contains("engeneer"));

        System.out.println("have now: "+stringToTestOn);
        System.out.println("so still the same => IMMUTABLE");

    }
}
