package t2.gevorderdecursusttwo.les03;

public class UncheckedExceptionHandler {
    public static void main(String[] args) {
        String[] words = {"One", "Two", "Three"};

        try {
            for (int index = 0; index <= 4; index++) {
                System.out.println(words[index]);
                //=> this will give an ArrayOutOfBoundsException
            }
        } catch (ArrayIndexOutOfBoundsException arrayEx) {
            System.out.println("Warning; Your array is too small!");
        }

    }
}
