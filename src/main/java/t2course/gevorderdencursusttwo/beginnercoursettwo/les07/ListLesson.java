package t2course.gevorderdencursusttwo.beginnercoursettwo.les07;

import java.util.ArrayList;

public class ListLesson {

    public static void main(String[] args) {
        ArrayList<String> whatWeLearned = new ArrayList<String>();
        whatWeLearned.add("Vandaag");
        whatWeLearned.add("leren");
        whatWeLearned.add("we");
        whatWeLearned.add("iets");
        whatWeLearned.add("bij");
        whatWeLearned.add("over");
        whatWeLearned.add("lijsten");

        System.out.print("Normal loop: \t");
        printListNormalLoop(whatWeLearned);

        System.out.print("\nEnhanced loop: \t");//seems to be what longer with more chance of screwups
        printListEnhancedLoop(whatWeLearned);

        System.out.println("\nSize list: " + whatWeLearned.size());
        System.out.print("\nafter removing 'iets' uit lijst: ");
        whatWeLearned.remove("iets");
        printListNormalLoop(whatWeLearned);

        System.out.println("\nSize list after remove: " + whatWeLearned.size());
    }


    private static void printListNormalLoop(ArrayList<String> listOfWords) {
        for (int index = 0; index < listOfWords.size(); index++) {
            System.out.print(listOfWords.get(index) + fillingCharacter(index, listOfWords.size() - 1));
        }
    }


    private static void printListEnhancedLoop(ArrayList<String> listOfWords) {
        int counter = 0;
        for (String woord : listOfWords) {
            System.out.print(woord + fillingCharacter(counter, listOfWords.size() - 1));
            counter++;
        }
    }


    private static String fillingCharacter(int index, int indexLastWord) {
        if (index != indexLastWord) {
            return " ";
        } else {
            return ".";
        }
    }
}
