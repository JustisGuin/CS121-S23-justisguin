public class forLoops {
    public static void main(String[] args) {
        //incrementing
        for(int i=1; i<=5; i++){
            System.out.println("Count is:"+i);
        }
        //decrementing
        for(int i=1; i>=5; i++){
            System.out.println("Count is"+i);
        }

        String state="Indiana";
        for(int i=0; i<state.length(); i++){
            System.out.println(state.charAt(i));
        }

    }
}
