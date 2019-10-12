package t2.gevorderdecursusttwo.les03;

public class IndexToBigException extends Exception{
    public IndexToBigException(){
        super("The index is to big for the number of elements in the array");
    }
}
