
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int newarr[]=nums1;
        nums1=new int[m+n];
        System.out.println(nums1.length);
        int i=0;
        int j=0;
        int idx=0;
        while(i<m&&j<n){
            if(newarr[i]<=nums2[j]){
                nums1[idx]=newarr[i];
                i++;
                idx++;
            }
            else{
                nums1[idx]=nums2[j];
                j++;
                idx++;
            }
        }
        while(i<m){
           nums1[idx]=newarr[i];
           i++;
           idx++;
        }
        while(j<n){
            nums1[idx]=nums2[j];
            j++;
            idx++;
        }
        printarray(nums1);
    }
    public static void main(String []args){
        int nums1[]={1,2,3,0,0,0};
        int nums2[]={2,5,6};
        merge(nums1, 3, nums2, 3);
        System.out.println(nums1.length);
        printarray(nums1);
        
        int a=2;
        int b=-1;
        int c=-1;
        int d=a^b;
        int e=c^d;
        System.err.println(e);
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(Arrays.asList(0, 1, 2));
        System.out.println(ans);


        /*int postion= BinarySearch(array, 30);
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
        Subarray(array);*/

    }
}
