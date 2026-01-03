public class Array2 {
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");

    }
    public static int maxsumSubarray(int arr[]){
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                System.out.print("{ ");
                int currsum=0; 
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    currsum+=arr[k];
                 }
                 if (currsum>maxsum){
                    maxsum=currsum;
                 }
                 System.out.print("}");
                 System.out.println("");
            }
        }
        return maxsum;
    }
     public static int PmaxsumSubarray(int arr[]){
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
               
                int currsum=0;
                currsum= start ==0?prefix[end]:prefix[end]- prefix[start-1] ;
               
                 if (currsum>maxsum){
                    maxsum=currsum;
                 }
            }
        }
        return maxsum;
    }
    public static int Kadane(int arr[]){
        int maxsum=Integer.MIN_VALUE;
        int sum[]=new int[arr.length];
        sum[0]=arr[0];
        if(sum[0]<0){
            sum[0]=0;
        }
        maxsum=Math.max(sum[0], maxsum);

        for(int i=1;i<arr.length;i++){
           
            sum[i]=sum[i-1]+arr[i];
            if(sum[i]<0){
                sum[i]=0;
            }
            maxsum=Math.max(sum[i], maxsum);

            
        }
        return maxsum;

    }
    
    public int mAxSubArray(int[] nums) {
      int current_sum=0;
        int max_sum=Integer.MIN_VALUE;
        boolean isnegative=true;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                isnegative=false;
                break;
            }
        }
        if(isnegative==false){
            for(int i=0;i<nums.length;i++){
                current_sum+=nums[i];
                if(current_sum<0){
                    current_sum=0;
                }
                if(max_sum<current_sum){
                    max_sum=current_sum;
                }
            }

        }
        else{
            for(int i=0;i<nums.length;i++){
                current_sum+=nums[i];
                max_sum=Math.max(current_sum,max_sum);
                current_sum=0;
            }
        }
        return max_sum;
    }
    public static int trappedRainwater(int heights[]){
        //calculating left max
        int leftmax[]=new int[heights.length];
        leftmax[0]=heights[0];
        for(int i=1;i<leftmax.length;i++){
            leftmax[i]=Math.max(leftmax[i-1],heights[i]);
        }
        printarray(leftmax);
        //calculating right max
        int rightmax[]=new int[heights.length];
        rightmax[rightmax.length-1]=heights[heights.length-1];
        for(int i=rightmax.length-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],heights[i]);
        }
        printarray(rightmax);
        //calculating trapped water
        int trappedwater=0;
        int currentwater=0;
        for(int i=0;i<heights.length;i++){
            
            currentwater=Math.min(rightmax[i],leftmax[i]) - heights[i] ;
            if (currentwater<=0){
                currentwater=0;
            }
            trappedwater+=currentwater;

        }

        return trappedwater;
    }
        public static void main(String []args){
        int array[]={1,-2,-1,3};
        int heights[]={4,2,0,6,3,2,5};
        System.out.println(maxsumSubarray(array));
        System.out.println(PmaxsumSubarray(array));
        System.out.println(Kadane(array));
        System.out.println(trappedRainwater(heights));

    }
}
