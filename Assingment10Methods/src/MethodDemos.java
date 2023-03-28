public class MethodDemos {
    public static void main(String[] args) {
        //printName("John");
        printStudentInfo("John",19,3.8);

    }
    public void printStudentInfo(String name, int age, double gpa){
        System.out.printf("Name: %s\nAge: %d\nGPA: %.1f\n",name, age, gpa);

    }
    public static void printName(String name){
        System.out.println(name);

    }
}
