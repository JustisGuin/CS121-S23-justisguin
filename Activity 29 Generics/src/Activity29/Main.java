package Activity29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();

        ArrayList<Integer> intArrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Double> doubleArrayList = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.3, 4.4));
        //ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("one", "two", "three", "four"));
        ArrayList<Boolean> booleanArrayList = new ArrayList<>(Arrays.asList(true, false, false, true));
        ArrayList<String> stringArrayList= new ArrayList<>(Arrays.asList("Alpha, Beta, Gamma, Delta eposlion"));

        gm.printArrayList(intArrayList);
        gm.printArrayList(doubleArrayList);
        gm.printArrayList(stringArrayList);
        gm.printArrayList(booleanArrayList);
    }
}
