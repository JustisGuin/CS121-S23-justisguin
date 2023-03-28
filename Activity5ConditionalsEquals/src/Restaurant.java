import java.util.Locale;
import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);

        System.out.println("Is anyone in you're party vegetarian?");
        String veggie= console.nextLine().toLowerCase();

        System.out.println("Is anyone in you're party vegan");
        String vegan= console.nextLine().toLowerCase();

        System.out.println("Is anyone is you're party gluten-free?");
        String gluten= console.nextLine().toLowerCase();

        System.out.println("Here are you're restaurant's");

        if (veggie.equals("no")){
            System.out.println("Joe's Gourmet Burger's");
        }
        else if (veggie.equals("yes") && vegan.equals("no") && gluten.equals("yes")){
            System.out.println("Main Street Pizza Company\n Corner Cafe\n The chef's Kitchen");
        }
        else if(veggie.equals("yes") && vegan.equals("yes") && gluten.equals("yes")){
            System.out.println("Corner Cafe\n The Chef's Kitchen");

        }
        else if (vegan.equals("no") && gluten.equals("no")){
            System.out.println("Mama's Fine Italian ");
        }

        }
}