public class Container {
    public static int maxwater(int arr[]){
        int si=0;
        int ei=arr.length-1;
        int Maxwater=Integer.MIN_VALUE;
        while(si<ei){
            int height=Math.min(arr[si],arr[ei]);
            int width=ei-si;
            int cuurWater=height*width;
            if(cuurWater>Maxwater){
                Maxwater=cuurWater;
            }
            if(arr[si]<arr[ei]){
                si++;
            }
            else{
                ei--;
            }
        }
        return Maxwater;
    }
    public static void main(String[] args){
        int arr[]={1,8,6,2,5,4,8,3,7};
        System.out.println(maxwater(arr));
    
    }
}
