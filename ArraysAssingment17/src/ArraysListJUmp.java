public class ArraysDemo {
    public static void main(String[] args) {
       String[] names = new String[5];

       names[0]= "Tom";
       names[1]= "Terry";
       names[2]= "Herbet";
       names[3]= "John";
       names[4]= "Rob";

       String[] names2={"Joe","Zayne","Bobby","Coach","Josh"};


       int[] scores = new int[5];

       scores[0]= 97;
       scores[1]= 86;
       scores[2]= 78;
       scores[3]= 83;
       scores[4]= 94;




       //System.out.printf("There are %d names in the names array\n",names.length);
       //System.out.println("The name at index 0 is "+names[0]);
       //System.out.printf("The name at index 1 is %s\n "+names[1]);
       //System.out.printf("The name at index 2 is %s\n"+ names[2]);
       //System.out.printf("The name at index 3 is %s\n"+ names[3]);
       //System.out.println("The name at index 4 is %s"+ names[4]);

       // System.out.printf("There are %d names in the names array\n",names.length);
        //System.out.println("The name at index 0 is "+names2[0]);
        //System.out.printf("The name at index 1 is %s\n "+names2[1]);
        //System.out.printf("The name at index 2 is %s\n"+ names2[2]);
        //System.out.printf("The name at index 3 is %s\n"+ names2[3]);
        //System.out.println("The name at index 4 is %s"+ names2[4]);


        for(int i=0; i< names.length; i++){
            System.out.println(names[i]);
        }
        System.out.println("What the loop is doing");
        for(int i=0; i< names.length; i++){
            System.out.printf("Loop %d: i is %d and gets the same name at index %d: %s\n")

        }


    }
}