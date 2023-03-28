public class Student {
    String name="John";
    String id= "12413";
    String major="Computer Science";
    double gpa=3.4;

    public Student(String name, String id, String major, double gpa){
        this.name=name;
        this.id=id;
        this.major=major;
        this.gpa=gpa;
    }

    void getStudentInfo(){
        System.out.printf("Name: %s%nID: %s%nMajor: %s%nGPA: %.1f",name,id,major,gpa);

    }

}