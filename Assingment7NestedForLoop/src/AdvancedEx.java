import java.util.Scanner;
public class AdvancedEx {
    public static void main(String[] args) {
            Scanner console= new Scanner(System.in);

            //var
            int classes, daysStudying, hoursStudying, hours;

            System.out.println("Enter number of classes");
            classes= Integer.parseInt(console.nextLine());
            System.out.println("Enter number of days spent studying each week");
            daysStudying= Integer.parseInt(console.nextLine());

            for(int i=1; i<=classes; i++){
                hoursStudying=0;
                System.out.printf("Class number %d\n",i);
                System.out.println("-".repeat(14)); //prints string x many times
                for (int j=1; j < daysStudying; j++){
                    System.out.printf("Enter hours spent studying for Class d% on day d%: \n", i,j);
                    hours= Integer.parseInt(console.nextLine());
                    hoursStudying += hours;

                }
                System.out.printf("Total number of hours spend each week studying for Class d%: d%\n\n", i, hoursStudying);


            }
    }
}
