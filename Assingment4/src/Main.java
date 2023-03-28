import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String mcu = ("Marvel Cinematic Unviverse");
        String decu = ("DC Extended Unviverse");

        String winner;
       // String winner2;

        System.out.println("Batman vs Captin Amercian: Who would win?");
        winner = console.nextLine();
        System.out.println();

        if (winner.equals("Batman")) {
            System.out.printf("%s wins this one.\n", decu);
        } else if (winner.equals("Captain America ")) {
            System.out.printf("%s wins this one\n ", mcu);
        } else {
            System.out.println("No an option");

        }

        //monday 9-10, break from 10-12, math class 12-1, phy 1-4 ,2 hour 4-6, 6-9


    }
}