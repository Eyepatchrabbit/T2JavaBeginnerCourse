package t2.gevorderdecursusttwo.les02.instrumentinterface;

public class Singer implements Bandmember {
    @Override
    public void playInstrument(Instrument instrument) {
        System.out.println("The singer is playing the: "+instrument.getName());
    }
}
