package t2course.gevorderdencursusttwo.beginnercoursettwo.les03;

public class ConditioneleOperator {

    public static void main(String[] args) {
        //explanation start lesson
        boolean largeNumber = true;
        String numberTrue = largeNumber ? "When true this is done" : "when going to false";

        System.out.println(numberTrue);

        //exercise
        int getalOne = 1000;
        int getalTwo = 10;
        int smallest = (getalOne < getalTwo) ? getalOne : getalTwo;

        System.out.println(smallest);
    }
}
