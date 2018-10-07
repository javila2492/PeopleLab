public class Runner {
    static String[] firstNames = {"Ben","Jordan","Phillip","Steven","Christina","Kent","Arnold","Kevin","Jonathan","John","Travis","Irene","Mead","Jason","Samantha"};
    static String[] familyNames = {"Chen","Lee","Wilson","Miller","Smith","Johnson","Brown","Williams","Davis","King","Lopez","Hill","Bailey","Cox","Murphy","Reed","Rogers"};
    static String[] subjects = {"Math", "Science", "English", "Spanish", "Computer Science", "Art", "Gym", "History", "Home Ec"};
    static String[] titles = {"Ms.", "Mr.", "Mrs.", "Mx."};
    static String[] firstTName = {"Sam", "Hayden", "Chris", "Tom", "Tam", "Kat", "Ana", "Jimmy", "Penny", "Gerald", "Mike", "Jesse"};
    static String[] familyTName = {"T", "Yossy", "Yoshida", "Jarret", "Chun", "Akers", "Ross", "Bass", "Thall"};
    public static void main(String[] args)
    {
        int r1 = (int) Math.floor(Math.random() * (subjects.length));
        int r2 = (int) Math.floor(Math.random() * (titles.length));
        int r3 = (int) Math.floor(Math.random() * (firstTName.length));
        int r4 = (int) Math.floor(Math.random() * (familyTName.length));
        Person Teacher = new Teacher(subjects[r1], titles[r2], firstTName[r3], familyTName[r4]);
        Person students[] = new Student[10];
        for(int i = 0; i < students.length; i++)
        {
            students[i] = randomStudent();
        }
        Classroom classroom = new Classroom(students, Teacher);
        System.out.println(classroom.printClass());
    }
    public static Student randomStudent()
    {
        double rnd = Math.floor(Math.random() * (4 + 1) + 1);
        int rnd1 = (int) Math.floor(Math.random() * (100 + 1) );
        int rnd2 = (int) Math.floor(Math.random() * (100 + 1) );
        int rnd3 = (int) Math.floor(Math.random() * (firstNames.length));
        int rnd4 = (int) Math.floor(Math.random() * (familyNames.length));
        return new Student(rnd, rnd1, rnd2, firstNames[rnd3], familyNames[rnd4]);
    }

}
