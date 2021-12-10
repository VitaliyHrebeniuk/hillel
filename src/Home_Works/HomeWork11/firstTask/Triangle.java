package Home_Works.HomeWork11.firstTask;

public class Triangle implements ThisInterface {
    float a;
    float b;
    float c;


    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public float getPerimeter(){return a + b + c;}


}
