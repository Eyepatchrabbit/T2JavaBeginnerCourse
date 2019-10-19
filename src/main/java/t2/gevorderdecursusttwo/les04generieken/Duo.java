package t2.gevorderdecursusttwo.les04generieken;

public class Duo<T> {
    private T first;
    private T second;

    public Duo(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

}
