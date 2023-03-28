import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //Asking for user input with the Scanner function
        System.out.print("Enter a number even or odd: ");
        //Reading the next line and carrying over the input from the user
        int num = reader.nextInt();

        //Asking if num % ==0 then print the input the user entered is even
        if(num % 2 == 0)
            System.out.println(num + " is even");
        //else print the user input is odd
        else
            System.out.println(num + " is odd");

    }
}