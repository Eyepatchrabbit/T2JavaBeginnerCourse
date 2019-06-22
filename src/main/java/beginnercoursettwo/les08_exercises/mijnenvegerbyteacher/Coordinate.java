package beginnercoursettwo.les08_exercises.mijnenvegerbyteacher;

public class Coordinate {

    private int x;
    private int y;
    private boolean shown = false;
    private String fieldValue = "?";
    private boolean bomb;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public boolean isShown() {
        return shown;
    }

    public void setShown(boolean shown) {
        this.shown = shown;
    }

    public boolean equals(Object object) {
        if (object instanceof Coordinate) {
            Coordinate otherCoordinate = (Coordinate) object;
            return this.x == otherCoordinate.x && this.y == otherCoordinate.y;
        }

        return false;
    }

    public boolean isBomb() {
        return bomb;
    }

    public void setBomb(boolean hasBomb) {
        this.bomb = hasBomb;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "x=" + x +
                ", y=" + y +
                ", shown=" + shown +
                ", fieldValue='" + fieldValue + '\'' +
                ", bomb=" + bomb +
                '}';
    }
}
