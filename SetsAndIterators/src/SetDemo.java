import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();// create a new set

        int[] intArray= {38,29,29,45,60,21,4,4,15};

        for (int num : intArray){ //add array elements to the set
            set.add(num); // add() method
        }

        //print the array -- contains duplicates
        System.out.print("Array: ");
        for (int elem : intArray){
            System.out.print(elem+ " ");
        }
        System.out.println();

        //print the set -- no duplicates
        System.out.print("Set: ");
        for (int elem: set){
            System.out.print(elem+ " ");

        }
        System.out.println();

        System.out.println("Size:"+ set.size()); // returns number of elements in the set

        set.remove(38); //removes element from set

        System.out.println("New Size: "+set.size());

        set.add(38);

        System.out.println("38 is in the set:" + set.contains(38)); // returns true if element is in set

        TreeSet<Integer> sortedSet=new TreeSet<>(set);

        System.out.print("Sorted Set:");
        for(int elem : sortedSet){
            System.out.printf(elem+ " ");
        }
        System.out.println();

        System.out.println("First element in sorted set is:"+ sortedSet.first());
        System.out.println("Last element in sorted set is:"+ sortedSet.last());

        System.out.println("Set is empty:" + sortedSet.isEmpty());
        sortedSet.clear();
        System.out.println("Set is empty:"+ sortedSet.isEmpty());
        System.out.println("Size: "+ sortedSet.size());
        
    }
}
