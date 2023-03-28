public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("John","123413","Computer Science",3.4);
        Student student2= new Student("Bob","123421","Teaching",3.6)

        System.out.printf("Name: %s%n",student1.name);
        System.out.printf("ID: %s%n",student1.id);
        System.out.printf("Major: %s%n",student1.major);
        System.out.printf("GPA: %s%n",student1.gpa);

        student1.getStudentInfo();
    }
}
