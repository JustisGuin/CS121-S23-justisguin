import java.util.Arrays;
import java.util.Scanner;

public class BookClubPoints {
    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);
        System.out.println("How many books have you purchased this month?");
        String manyBooks= console.nextLine();
       // String[] number={"0,1,2,3,4"};
        int points=0;

        if(manyBooks=="0") {
            //String.join("1", number);
            points+=0;
        } else if (manyBooks=="1") {
            points+=5;

        }
        else if (manyBooks=="2"){
            points+=15;
            
        } else if (manyBooks=="3") {
            points+=30;
        } else{
            points+=40;
        }
        System.out.println("Points: "+ points);
        //  System.out.println(Arrays.toString(number));



    }

}
