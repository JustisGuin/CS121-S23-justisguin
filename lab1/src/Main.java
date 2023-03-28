import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name = "Justis" + " " + "Guin";
        String firstName = "Justis";
        String lastName = "Guin";
        String fullname = String.format("%s %s", firstName + "" + lastName);

        int age = 18;
        double gpa = 3.8;
        char grade = 'A';
        String info = String.format("name: %s\nage %d\ngpa: %.1f\ngrade: %c\n", fullname, age, gpa, grade);

        // System.out.println(fullname);
        //System.out.println(info);
        //System.out.printf("name: %s\nage:%d\ngpa: %.1f\ngrade: %c\n",fullname, age, gpa
        //,grade);


        //System.out.println(name);
        //System.out.println();
        //System.out.println(firstName + "" + lastName);
        //System.out.println();
        //System.out.println(fullname);
        //System.out.println();
        //System.out.println("name:" + name + ", age: " + age + ",gpa " + gpa + ",grade" + grade);


        System.out.printf("0. %s\n", name);
        System.out.printf("1. %s\n", name.replace("Justis", "Billy Bob"));
        System.out.printf("2. %s\n", name);
        name = name.replace("Justis", "Billy Bob");
        System.out.printf("3. %s\n\n", name);


        //String.length()
        System.out.printf("Number of characters: %d\n\n", name.length());

        //String.toUpper() and upper String.toLowerCase()
        System.out.printf("%s\n", name.toUpperCase());
        System.out.printf("%s\n", name.toLowerCase());
        System.out.printf("%s\n\n", name); //no change in the og

        //String.charAt(index)
        System.out.printf("Initials: %s.%s.\n\n", name.charAt(0), name.charAt(5));

        //String.substring(beginning index, ending index)
        System.out.printf("First name %s\nLast name: %s \n\n", name.substring(0, 4), name.substring(5, 8));


    }


    public class Scan {
        public static void main(String[] args) {
            Scanner console= new Scanner(System.in);

            System.out.println("Please enter your name: ");
            String firstName= console.nextLine();
            System.out.println("Please enter your last name");
            String lastName=console.nextLine();

            System.out.printf("Full name: %s %s", firstName, lastName);

            console.close();
        }
    }


}

