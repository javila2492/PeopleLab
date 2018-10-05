public class Runner {
    static String[] firstNames = {"Ben","Jorden","Phillip","Steven","Christina","Kent","Arnold","Kevin","Jonathan","John","Travis","Irene","Mead","Jason","Samantha"};
    static String[] familyNames = {"Chen","Lee","Wilson","Miller","Smith","Johnson","Brown","Williams","Davis","King","Lopez","Hill","Bailey","Cox","Murphy","Reed","Rogers"};
    public static void main(String[] args)
    {
        Person Teacher = new Teacher("Math","Mr.","Nathan","Levin");
        Person students[] = new Student[10];
        Classroom classroom = new classroom(Student,Teacher);

    }
    public Student randomStudent()
    {
        double rnd = Math.floor(Math.random() * (4 + 1));
        int rnd1 = (int) Math.floor(Math.random() * (100 + 1) );
        int rnd2 = (int) Math.floor(Math.random() * (100 + 1) );
        int rnd3 = (int) Math.floor(Math.random() * (firstNames.length + 1));
        int rnd4 = (int) Math.floor(Math.random() * (familyNames.length + 1));
        Student student = new Student(rnd,rnd1,rnd2,firstNames[rnd3],familyNames[rnd4]);
        return student;
    }

}
