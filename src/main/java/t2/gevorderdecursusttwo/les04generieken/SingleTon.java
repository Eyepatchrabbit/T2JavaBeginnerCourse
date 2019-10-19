package t2.gevorderdecursusttwo.les04generieken;

public class SingleTon<T> {

    private T single;

    public SingleTon(T single) {
        this.single = single;
    }

    public T getSingle() {
        return single;
    }

    public String toString(){
        return single.toString(); //Take a look here!
    }
}
