package TrenLop;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int mangSoNguyen[] = new int[]{5,3,7,1,8,9};
        int mangSoNguyen1[] = new int[]{4,8,6,2,5,7,9};
        System.out.println("Mảng:"+Arrays.toString(mangSoNguyen));
        selectionSort(mangSoNguyen);
        System.out.println("mảng sau sắp xếp bằng selectionSort:"+Arrays.toString(mangSoNguyen));
        bubbleSort(mangSoNguyen);
        System.out.println("Mảng sau khi sắp xếp bằng bubbleSort"+Arrays.toString(mangSoNguyen));
        System.out.println("Mảng: "+Arrays.toString(mangSoNguyen1));
        sort(mangSoNguyen1);
        System.out.println("Mảng sau khi sắp xếp chèn"+Arrays.toString(mangSoNguyen1));
}
public static void selectionSort(int[] arr){
    for(int i=0;i<arr.length - 1 ; i++)
    {
        int index = i;
        for(int j = i+1; j<arr.length;j++){
            if(arr[j] < arr[index]){
                index = j;
            }
        }
        int smallerNumber = arr[index];
        arr[index] = arr[i];
        arr[i] = smallerNumber;
    }
}
static void bubbleSort(int[]arr){
    int n = arr.length;
    int temp = 0;
    for(int i=0; i<n; i++){
        for(int j=1; j<(n-1); j++){
            if(arr[j-1] > arr[j]){
                temp =arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
            }
        }
        
    }
}
static void sort(int arr[]){
    int n = arr.length;
    for(int i=1; i<n; ++i){
        int key = arr[i];
        int j = i - 1;

        while(j >= 0 && arr[j] > key){
            arr[j+1] = arr[j];
            j=j-1;
        }
        arr[j+1] =key;
    }
}
}