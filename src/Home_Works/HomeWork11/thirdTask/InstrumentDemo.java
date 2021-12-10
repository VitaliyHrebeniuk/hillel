package Home_Works.HomeWork11.thirdTask;

import Home_Works.HomeWork11.secondTask.Printable;

public class InstrumentDemo {
    public static void main(String[] args) {
        Instrument guitar = new Guitar(6);
        Instrument trumpet = new Trumpet(5);
        Instrument drums = new Drums(3);

        Instrument[] instruments = {guitar, trumpet,drums};

        for(Instrument i : instruments){
            i.play();
        }
    }
}
