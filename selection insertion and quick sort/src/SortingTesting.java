public class SortingTesting {

    public void selectionSort(int[] array){
        for (int i=0; i<array.length-1; i++){
            int min =i;

            for (int j=1 +1; j< array.length; j++ ){
                if (array[j] < array [min]){
                    min=j;

                }
            }
            int temp= array[i];
            array[i]= array[min];
            array[min] = temp;


        }
    }

}
