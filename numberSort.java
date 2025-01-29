public class numberSort {
    public static void isSort(int arr []){
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String [] args ) {
        int arr[] ={ 1,5,2,0,4,9};
        //bubble sort
        for(int i =0; i< arr.length-1; i++) { //outer loop
            for(int j =0; j<arr.length-i-1;j++) {
                //swap
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
        isSort(arr);
    }
}
