package t2.gevorderdecursusttwo.les03;

public class NegativeSizeException extends Exception {
    public NegativeSizeException() {
        super("Index cannot be less then 0.");
    }

}
