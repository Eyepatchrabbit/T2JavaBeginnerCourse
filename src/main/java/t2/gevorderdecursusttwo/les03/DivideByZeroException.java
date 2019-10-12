package t2.gevorderdecursusttwo.les03;

public class DivideByZeroException extends Exception {
    public DivideByZeroException() {
        super("Attempting to devide by zero!");
        //=>is specifiek aan 1 element gelinkt->gemakkelijker te zien wat er aan de hand is!
    }
}
