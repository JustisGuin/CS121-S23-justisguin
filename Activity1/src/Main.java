//imports
import javax.swing.JOptionPane;
import java.util.Locale;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        //String firstName, lastName;
      Scanner console= new Scanner(System.in);

       // System.out.println("Please give me you're first name: ");
        //String firstName= console.nextLine();
        //System.out.println("Please give me you're last name: ");
        //String lastName= console.nextLine();
        //System.out.println(firstName+ " "+ lastName);
        //String fullName= console.nextLine();
        //System.out.println(fullName.toLowerCase());
       // String fullNames=console.nextLine();

    String firstName= (JOptionPane.showInputDialog("Please type your first name: "));
    System.out.println("Please give me your last name:");
    String lastName=console.nextLine();
    String fullName= (firstName+ " "+ lastName);


    System.out.println(fullName);
    System.out.println(fullName.toUpperCase());
    System.out.println(fullName.toLowerCase());

    //reverse of this function https://www.geeksforgeeks.org/stringbuffer-reverse-method-in-java/
    StringBuffer sbf = new StringBuffer(fullName);
   //  System.out.println(fullName + sbf);
    sbf.reverse();
    System.out.println(sbf);



                Scanner console1 = new Scanner(System.in);
                Double firstnumber = (Double.valueOf(JOptionPane.showInputDialog("Please type a number")));
                System.out.println("Please type another number");
                Double secondnumber = (Double.valueOf(console1.nextLine()));
                System.out.println(firstnumber + secondnumber);
                System.out.println(firstnumber - secondnumber);
                System.out.println(firstnumber * secondnumber);
                System.out.println(firstnumber / secondnumber);
                //System.out.println(java.lang.Math.sqrt(firstnumber), (java.lang.Math.sqrt(secondnumber));


            }
        }





















        //   System.out.printf("%s\n",firstName.toLowerCase());

    }


    }

}
