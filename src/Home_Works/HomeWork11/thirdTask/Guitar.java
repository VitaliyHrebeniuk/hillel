package Home_Works.HomeWork11.thirdTask;

public class Guitar implements Instrument{
    int numberOfString;

    public Guitar(int numberOfString) {
        this.numberOfString = numberOfString;
    }

    @Override
    public void play() {
        System.out.println("Играет Гитара с количеством струн " + numberOfString);
    }
}
