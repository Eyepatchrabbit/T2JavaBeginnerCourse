package beginnercoursettwo.les04;

public class HouseGarden {

    private int trees;

    public HouseGarden(int trees) {
        setTrees(trees);
    }

    public int getTrees() {
        return this.trees;
    }

    public void setTrees(int trees) {
        this.trees = trees;
    }

    public boolean equals(Object object) {
        if (object instanceof HouseGarden){
            HouseGarden houseGardenToCompare= (HouseGarden) object;
            return houseGardenToCompare.getTrees()==this.trees;
        }

        return false;
    }


}
