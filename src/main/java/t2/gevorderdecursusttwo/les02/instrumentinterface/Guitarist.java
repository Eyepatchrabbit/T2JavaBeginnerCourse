package t2.gevorderdecursusttwo.les02.instrumentinterface;

import java.sql.SQLOutput;

public class Guitarist implements Bandmember {
    @Override
    public void playInstrument(Instrument instrument) {
        System.out.println("The guitarist is playing the "+ instrument.getName());
    }
}
