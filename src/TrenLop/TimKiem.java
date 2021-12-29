package TrenLop;

public class TimKiem {
    public static void main(String[] args) {
        int[] mangSoNguyen = new int[]{5,7,9,6,8,2,4,3,1};
        int viTri = search(mangSoNguyen, 2);
        if(viTri == -1){
            System.out.println("Không tìm thấy số cần tìm");
        }else
            System.out.println("tìm thấy ở vị trí "+viTri);

        System.out.println("Tìm kiếm nhị phân");
        selectionSort(mangSoNguyen);
        int viTri1 = binarySearch(mangSoNguyen, 2);
        if(viTri1 == -1){
            System.out.println("không tìm thấy số cần tìm");
        }else
            System.out.println("tìm thấy ở vị tri "+viTri1);
    }
    public static int search(int arr[], int x){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] == x)
                return i;
        }
        return -1;
    }
    static int binarySearch(int arr[],int x){
        int l = 0, r = arr.length-1;
        while (l <= r){
            int m = l+(r-1) /2;
            if(arr[m] == x)
                return m;
            if(arr[m] < x)
                l = m+1;
            else    r = m-1;
        }
        return -1;
    }
    static void selectionSort(int[] arr){
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
}
