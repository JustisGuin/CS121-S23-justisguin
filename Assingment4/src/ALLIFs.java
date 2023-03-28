import java.util.Scanner;

public class ALLIFs {
    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);

        System.out.println("Do you need a Windows computer?");
        String windows= console.nextLine().toLowerCase();
        System.out.println("Do you need a fast computer ");
        String fast = console.nextLine().toLowerCase();
        System.out.println("Do you need a gaming computer");
        String gamingChair=console.nextLine().toLowerCase();
        console.close();

        System.out.println("\nHere are your choices:");

        if(gamingChair.equals("no")){
            System.out.println("\tDell XPS 13 7390");
        }
        if (gamingChair.equals("no") && fast.equals("no")) {
            System.out.println("\tDell Dimension 3000 PC");
        }
        if (windows.equals("no")&& fast.equals("no")&& gamingChair.equals("no")){
            System.out.println("\tApple iMac G3");

        }
        System.out.println("\tInsprion 15 3000");
        System.out.println("\tDigital Storm Lumos Gaming PC");

    }

}
