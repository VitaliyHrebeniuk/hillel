package Home_Works.HomeWork10;

public class Aspirant extends Student {
    String scienceWork;

    public Aspirant(String name, double avgMark, String scienceWork) {
        super(name ,avgMark);
        this.scienceWork = scienceWork;
    }

    public static void main(String[] args) {
        Student student = new Student("Vitalii", 4.0);
        Aspirant aspirant = new Aspirant("Alex",5.0, "work");
        Student[] students = {student, aspirant};
        for (Student s : students) {
            System.out.println(s.getScholarship());
        }
    }

    @Override
    public double getScholarship() {
        if (avgMark >= 5.0){
            return 200;
        }
        return 180;
    }
}
