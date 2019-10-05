package t2.gevorderdecursusttwo.les02.instrumentinterface;

public class Band {
    public static void main(String[] args) {
        Instrument guitar = new Guitar();
        Instrument vocals = new Vocals();
        Instrument drums = new Drums();

        Bandmember drummer = new Drummer();
        Bandmember singer = new Singer();
        Bandmember guitarist = new Guitarist();

        guitarist.playInstrument(guitar);
        singer.playInstrument(vocals);
        drummer.playInstrument(drums);

    }
}
