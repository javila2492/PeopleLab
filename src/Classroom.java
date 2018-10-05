public class Classroom
{
    Person[] students;
    Person teacher;

    public Classroom(Person[] students,Person teacher)
    {
        this.students = students;
        this.teacher = teacher;
    }

    public String getSubject(Person teacher)
    {
        this.teacher = teacher;
    }
    public double classAverage()
    {
        double sum = 0.0;
        for(Person Student : students)
        {
            Student += Student.getGPA();
        }
        return sum / students.length();
    }
    public void printClass()
    {
        System.out.println(teacher);
        System.out.println(teacher.getSubject());
        for(Person student : students)
        {
            System.out.println(student);
        }
    }

}
