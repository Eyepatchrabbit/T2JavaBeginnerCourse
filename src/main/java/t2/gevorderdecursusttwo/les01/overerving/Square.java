package t2.gevorderdecursusttwo.les01.overerving;

public class Square extends Shape {

    public Square(int side) {
        super(side, side);
    }

    //in intellij ->see o with pijl naar boven->indicates overschrijving
    public void setHeight(int height){
        super.setHeight(height);//watchout!=>watchout here for infinite loops!!! ->need super so original is set
        setWidth(height);//->here don't need to set the super, because no new one here

        //!can't get to the privates so "this.height =10" -> if want to do this-> change 'private' to 'protected'
    }

    @Override
    public double getArea() {
        return Math.pow(getHeight(),2);
    }

}
