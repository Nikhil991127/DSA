public class Divide {
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void mergesort(int arr[],int start,int end){
        if(start>=end){
            return ;
        }
        int mid= start+(end-start)/2;
        mergesort(arr, start, mid);
        mergesort(arr, mid+1, end);
        merge(arr,start,mid,end);
    }
    public static void merge(int arr[],int start,int mid,int end){
        int temp[]=new int[end-start+1];
        int k=0;
        int i=start;
        int j=mid+1;
        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=end){
            temp[k++]=arr[j++];
        }
        for(k=0,i=start; k<temp.length ; i++,k++){
            arr[i]=temp[k];
        }
    }
    public static void quicksort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pivotidx=position( arr, si , ei);
        quicksort(arr, si, pivotidx-1);
        quicksort(arr, pivotidx+1, ei);
    }
    public static int position(int arr[],int si,int ei){
        //System.err.println("entered in position");
        int temp[]=new int[ei-si+1];
        int i =si;
        int pivot=ei;
        int k=0;
        //System.out.println("Stuck");
       while(i<ei){
        if(arr[i]<arr[pivot]){
            temp[k]=arr[i];
            //System.out.println("Swap 1");
            k++;
        }
        i++;
       }
       //System.out.println("stuck");
       temp[k]=arr[pivot];
       pivot=k;
       k++;
       i=si;
       while(i<ei){
        if(arr[i]>temp[pivot]){
            temp[k]=arr[i];
            //System.out.println("Swap2");
            k++;
        }
        i++;
       }
        for(k=0,i=si; k<temp.length ; i++,k++){
            arr[i]=temp[k];
        }
        System.out.println(pivot);
        return pivot;



    }
    public static void main(String[] args) {
        int arr[]={6,5,4,8,7,9};
        printarr(arr);
        quicksort(arr, 0, arr.length-1);
        printarr(arr);
        
    }
}
