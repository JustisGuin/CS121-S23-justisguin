import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);

        System.out.println("Please enter side 1 of a triangle");
        Integer side1= console.nextInt();
        System.out.println("Please enter side 2 of the traingle");
        Integer side2=console.nextInt();
        System.out.println("Please enter side 3 of the traingle");
        Integer side3=console.nextInt();


        if(side1 ==side2 && side2==side3 &&side1 ==side3) {
            System.out.println("It's a Equilateral Triangle");

        }
        else if (side1 != side2 && side2!=side3 && side1!= side3){
            System.out.println("It's a Scalene Triangle");
        }

        else{
            System.out.println("It's Iscoseles Triangle");
        }
    }
}
