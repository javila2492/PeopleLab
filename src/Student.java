public class Student extends Person {
    private double gpa;
    private int grade;
    private int id;
    private String firstName;
    private String familyName;

    public Student(double gpa, int grade, int id, String firstName, String familyName)
    {
        super(firstName,familyName);
        this.gpa = gpa;
        this.grade = grade;
        this.id = id;
    }
    public double getGPA()
    {
        return gpa;
    }
    @Override
    public String toString()
    {
        return familyName + ", " + firstName;
    }
}
