public class BasicSorting {
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");

    }
    public static void bubbleSort(int arr[]){
        int lengths=arr.length;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<lengths-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void selectionSort(int arr[]){
        int lengths=arr.length;
        for(int i=0;i<arr.length-1;i++){
            int min=i; 
            for(int j=i+1;j<lengths;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 &&arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    public static void main(String[]args){
        int arr[]={10,5,6,7,9};
        insertionSort(arr);
        printarray(arr);
    }
}
