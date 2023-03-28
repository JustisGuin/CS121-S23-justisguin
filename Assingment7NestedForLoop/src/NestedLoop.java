public class NestedLoop {
    public static void main(String[] args) {
        int weeks= 3;
        int days= 7;

        for (int i =1; i<=5; i++){
            for (int j =1; j<=5; j++){
                System.out.println("outer loop "+ i + "- inner loop"+ j);

            }
            System.out.println();
        }
        for(int i=1; i<=weeks; ++i){
            System.out.printf("Weeks %d\n",i);
            for (int j=1; j<=days; ++j){
                System.out.printf("\tDay: %d\n",j);
            }

        }

        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.printf("i = %d   j = %d\n", i, j);
            }
        };






    }
}