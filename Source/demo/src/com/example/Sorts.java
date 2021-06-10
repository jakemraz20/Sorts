package Source.demo.src.com.example;

import java.util.ArrayList;

public class Sorts {
    Sorts(){}

    //Quick Sort Methods
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

    //Merge Sort Methods
    public void mergeSortStart(ArrayList<Integer> sortMe){
        mergeSort(sortMe, 0, sortMe.size()-1); //use -1 to prevent out of bounds during merge
    }

    private void mergeSort(ArrayList<Integer> arr, int left, int right){
        int median;
        if(left >= right){
            System.out.println("Returning");
            return;
        }
            median = (left + right)/2;
            mergeSort(arr, left, median); //Get left side
            mergeSort(arr, median+1, right); //Get right side
            merge(arr, left, right); //Merge
            

    }

    private void merge(ArrayList<Integer> arr, int left, int right){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int median = (left+right)/2; //Left finish
        int l = left; //Left starting
        int r = median+1; //Right starting
        //Go up to median, and right side to ensure we get all values, *NOTE this is why size was reduced up to
        //Without = on right, we will miss last value occasioanlly and list will not sort properly
        while(l <= median && r <= right){ 
            if(arr.get(l) < arr.get(r)){
                temp.add(arr.get(l));
                l++;
            }
            else {
                temp.add(arr.get(r));
                r++;
            }
        }
        //Now we have completed a list, so we need to complete rest of other list
        while(l <= median){
            temp.add(arr.get(l));
            l++;
        }
        while(r < right){
            temp.add(arr.get(r));
            r++;
        }
        //Copy sorted temp back into array
        for(int i = 0; i < temp.size(); i++){
            arr.set((left+i), temp.get(i));
        }
    }
    
}
