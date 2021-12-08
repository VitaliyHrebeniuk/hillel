package Home_Works.HomeWork10;

public class Student {
    String name;
    double avgMark;

    public Student(String name, double avgMark) {
        this.avgMark = avgMark;
    }

    public double getScholarship(){
        if (avgMark >= 5.0){
            return 100;
        }
        return 80;
    }


}
