import java.util.Scanner;
public class SwitchActivity {
    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);
        System.out.println("Please enter one of the planet");
        String planets= console.nextLine();
      //  String planetInfo;

        switch (planets){

            case "Mercury":
               System.out.println("Radius:1,561mi\n From sun: 40.125M mi");
                break;

            case "Venus":
                System.out.println("Radius: 3,760.4mi\n From sun: 67.49M mi");
                break;
            case "Earth":
                System.out.println("Radius:3958.8mi\n From sun: 91.571M mi");
                break;
            case "Mars":
                System.out.println("Radius:2106.1mi\n From sun: 149.45M mi");
                break;
            case "Jupiter":
                System.out.println("Radius:43,441mi\n From sun: 460.25M mi");
                break;
            case "Saturn":
                System.out.println("Radius:36,184mi\n From sun: 912.39M mi");
                break;
            case "Uranus":
                System.out.println("Radius:15,759mi\n From sun: 1.8274M mi");
                break;
            case "Neptune":
                System.out.println("Radius: 15,299mi\n From sun:2.7797M mi");
                break;
        }
    }
}