public class Classroom
{
    Person[] students;
    Person teacher;

    public Classroom(Person[] students,Person teacher)
    {
        this.students = students;
        this.teacher = teacher;
    }

    public Person getSubject(Person teacher)
    {
        this.teacher = teacher;
        return teacher;
    }
    public double classAverage()
    {
        double sum = 0.0;
        for(Person Student : this.students)
        {
            sum += ((Student)Student).getGPA();
        }
        return sum / students.length;
    }
    public String printClass()
    {
        String e = "";
        for(Person Student : students)
        {
            e += Student.getFirstName() + " " + Student.getFamilyName() + ", ";
        }
        return teacher.toString()  + ", " + "Students: " + e + ", " + "Class Average: " + classAverage();
    }
}
