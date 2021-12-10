package Home_Works.HomeWork11.thirdTask;

public class Drums implements Instrument{
    int size;

    public Drums(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Играют Барабаны размером " + size);
    }
}
