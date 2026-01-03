public class Array1 {
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");

    }
    public static int LineaSearch(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if (target==arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static int largestno(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>=max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int smallestno(int arr[]){
        int min =Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if (arr[i]<=min){
                min=arr[i];
            }
        }
        return min;
    }
    public static int BinarySearch(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        int mid=start+(end- start)/2;
        while(start<=end){
            if (arr[mid]==target){
                return mid;
            }
            else if (target>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            mid =start+(end-start)/2;
        }
        return -1;
    }
    public static void reversearrar(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
    }
    public static void allpairs(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+") ");
            }
            System.out.println("");
        }
    }
    public static void Subarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                System.out.print("{ "); 
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                 }
                 System.out.print("}");
                 System.out.println("");
            }
        }
    }
    public static void main(String []args){
        int array[]={10,20,30,40,50};
        int postion= BinarySearch(array, 30);
        System.out.println("largest no in array is "+largestno(array) );
        System.out.println("Smallest no in array is "+smallestno(array) );
        if (postion==-1){
            System.out.println("target not present in list");
        }
        else{
            System.out.println("target is present at "+ (postion+1) +"  location") ;
        }
        System.out.println("before reverse");
        printarray(array);
        reversearrar(array);
        System.out.println("after reverse");
        printarray(array);
        allpairs(array);
        Subarray(array);

    }
}
