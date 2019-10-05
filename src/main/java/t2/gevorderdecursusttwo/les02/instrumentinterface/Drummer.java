package t2.gevorderdecursusttwo.les02.instrumentinterface;

public class Drummer implements Bandmember {
    @Override
    public void playInstrument(Instrument instrument) {
        System.out.println("The drummer plays the: "+instrument.getName());
    }
}
