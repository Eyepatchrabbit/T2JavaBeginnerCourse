package t2.gevorderdecursusttwo.les03;

public class NegativeArraySize {
    public static void main(String[] args) {

        try {
            System.out.println(getItemFromArray(2));
            System.out.println(getItemFromArray(1));
            System.out.println(getItemFromArray(0));
            System.out.println("This is still printed");
            System.out.println(getItemFromArray(4));
            //System.out.println(getItemFromArray(-1));
            System.out.println("Not printed anymore!!");

        } catch (NegativeSizeException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (IndexToBigException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();

        }
    }


    /**
     * get an item from an array
     *
     * @param position
     * @return String containing a word
     * @throws NegativeSizeException when position is less then 0
     * @throws IndexToBigException when position given is bigger than the size of the actual array
     * */
    public static String getItemFromArray(int position) throws NegativeSizeException, IndexToBigException {

        if (position < 0) {
            throw new NegativeSizeException();
        }

        String[] words = {"One", "Two", "Three"};

        if (position>=words.length){
            throw new IndexToBigException();
        }

        return words[position];
    }
}
