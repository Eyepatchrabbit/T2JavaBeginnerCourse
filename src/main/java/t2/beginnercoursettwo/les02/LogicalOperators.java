package t2.beginnercoursettwo.les02;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean firstValue = true;
        boolean secondValue = false;

        boolean thirdValue=true;

        System.out.println(firstValue + " && " + secondValue + " = " + (firstValue && secondValue));
        System.out.println(firstValue + " || " + secondValue + " = " + (firstValue || secondValue));
        System.out.println("Watchout!; "+firstValue + " && " + secondValue +" ||"+thirdValue+ " = " + (firstValue && secondValue || thirdValue));

        //=>will first run the && and then look at the ||
        //van links naar rechts evalueren
        System.out.println();


        System.out.println(firstValue + " && " + true + " = " + (firstValue && doTrue()));
        System.out.println(firstValue + " || " + true + " = " + (firstValue || doTrue()));
        System.out.println(false + " || " + true + " = " + (false || doTrue()));

    }

    private static boolean doTrue(){
        System.out.print("doTrue executed ");
        return true;
    }


}
