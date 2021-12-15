package Home_Works.HomeWork11.firstTask;

public class Square implements ThisInterface {
    float a = 4;

    public Square(float a) {
        this.a = a;
    }
    @Override
    public float getPerimeter(){return a * 4;}
}
