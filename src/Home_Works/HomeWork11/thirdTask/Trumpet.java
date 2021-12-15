package Home_Works.HomeWork11.thirdTask;

public class Trumpet implements Instrument{
    int diameter;

    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет Труба с диаметром " + diameter);
    }
}
