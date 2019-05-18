package beginnercoursettwo.les04;

public class House {

    private int rooms;
    private String adress;
    private HouseGarden houseGarden;

    public House(String adress) {
        //this.adress=adress;
        setAdress(adress);
    }

    public House(String adress, int trees) {
        //this.adress=adress;
        setAdress(adress);
        if (trees > 0) {
            this.houseGarden = new HouseGarden(trees);
        }
    }

    public House(String adress, HouseGarden houseGarden) {
        setAdress(adress);
        setHouseGarden(houseGarden);
    }

    public String getAdress() {
        return this.adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getRooms() {
        return this.rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public HouseGarden getHouseGarden() {
        return this.houseGarden;
    }

    public void setHouseGarden(HouseGarden houseGarden) {
        this.houseGarden = houseGarden;
    }

    public void print() {
        String toprint = "For HouseObject: The adress is " + this.getAdress() + " and has " + this.getRooms() + " rooms.";
        if (this.houseGarden != null) {
            toprint = toprint + " This has " + getHouseGarden().getTrees() + " trees.";
        } else {
            toprint = toprint + " This house has no trees.";
        }

        System.out.println(toprint);

    }

    public boolean equals(Object object) {
        if (object instanceof House) {
            House houseToCompare = (House) object;
            if (houseToCompare.getHouseGarden() == null && this.houseGarden == null) {
                return baseElementsEqualForComparisonHouses(houseToCompare);
            } else if (houseToCompare.getHouseGarden() != null && this.houseGarden != null) {
                return baseElementsEqualForComparisonHouses(houseToCompare) && houseToCompare.getHouseGarden().equals(this.houseGarden);
            }
        }
        return false;
    }

    private boolean baseElementsEqualForComparisonHouses(House houseToCompare) {
        return houseToCompare.getAdress().equals(this.adress) && houseToCompare.getRooms() == this.rooms;
    }


}
