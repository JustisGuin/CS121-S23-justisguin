import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<>();
        names.add("Alice");
        names.add("Steve");
        names.add("Jack");


        //Disaply elements of names list
        // intiaizlize iterator by colling collection's
        Iterator<String> iter= names.iterator();
        // has next() returns a boolean, true or false
        //while it's true iter has a next element

        while(iter.hasNext()){
            //... the next element will be assinged to name
            // and name's values printed
            String name = iter.next();
            System.out.println(name);
        }
    }
}
