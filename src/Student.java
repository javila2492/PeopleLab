public class Student extends Person {
    private double gpa;
    private int testGrade;
    private int id;
    private String firstName;
    private String familyName;

    public Student(double gpa, int testGrade, int id, String firstName, String familyName)
    {
        super(firstName,familyName);
        this.gpa = gpa;
        this.testGrade = testGrade;
        this.id = id;
    }
    public double getGPA()
    {
        return gpa;
    }
    public double getID()
    {
        return id;
    }
    @Override
    public String toString()
    {
        return familyName + ", " + firstName;
    }
}
