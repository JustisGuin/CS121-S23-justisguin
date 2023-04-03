package activity26;

import java.util.Scanner;

public class Sorting {

    public int[] getArray(){
        Scanner input= new Scanner(System.in);
        //Making 5 New Inputs
        int [] arr= new int[5];
        System.out.println("Enter 5 Integer's:\n ");
        for(int i=0 ; i<5; i++){
            arr[i]= input.nextInt();
        }
        return arr;


    }
    public int[] sortArray(int[] arr) {
        // Using bubble sort algorithm
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;

    }

}
