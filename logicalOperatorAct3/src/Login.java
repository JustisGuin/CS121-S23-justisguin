import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);

        //var
        String userName=("JGuin");
        Integer password=12345;


        //ui
        System.out.println("What is you're userName?");
        String ui= console.nextLine();

        System.out.println("What is you're passWord?");
        int ui2=console.nextInt();

        if(ui.equals(userName) && (ui2==password)){
            System.out.println("Welcome to CS121!");

        }
        else if(ui!=(userName) && (ui2==password || ui.equals(userName) && ui2!=(password))){
            System.out.println("Either userName or passWord is wrong please try again");

        }
        else{
            System.out.println("This is the wrong UserName");

        }



    }
}
