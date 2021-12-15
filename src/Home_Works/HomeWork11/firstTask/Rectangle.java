package Home_Works.HomeWork11.firstTask;

public class Rectangle implements ThisInterface {

    private float width = 2;
    private float height = 2;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public float getPerimeter() {
        return width * 2 + height * 2;
    }

}
