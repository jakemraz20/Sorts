package Source.demo.src.com.example;

import java.util.ArrayList;

public class Sorts {
    Sorts(){}

    public void quickSortStart(ArrayList<Integer> sortMe){
        quickSort(sortMe, 0, (sortMe.size()-1));
    }

    private void quickSort(ArrayList<Integer> arr, int low, int high){
        int partitionIndex;
        if(low < high){
            partitionIndex = quickSortPartition(arr, low, high);

            quickSort(arr, low, partitionIndex-1);
            quickSort(arr, partitionIndex+1, high);

        }
    }

    private int quickSortPartition(ArrayList<Integer> arr, int low, int high){
        int pivot = arr.get(high);
        int i = low -1;

        for(int n = low; n < high; n++ ){
            if(arr.get(n)<pivot){
                i++;
                swap(arr, i, n);
            }
        }
        swap(arr,i +1, high);
        return (i + 1);
    }

    private void swap(ArrayList<Integer> arr, int a, int b){
        Integer temp = arr.get(a);
        arr.set(a, arr.get(b));
        arr.set(b, temp);
    }
    
}
