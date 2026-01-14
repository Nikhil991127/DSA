public class Bit {
   public static void oddeven(int i){
        if((i & 1) ==1){
            System.out.println("no is odd");
        }
        else{
            System.out.println("no is even");
        }
    }
    public static void getithbit(int no,int ith ){
        int bitmask=(1<<ith);
        if((no & bitmask)!=0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
    public static void setithbit(int no,int ith){
        int bitmask=(1<<ith);
        no=no|bitmask;
        System.out.println(no);
    }
     public static void clearithbit(int no,int ith){
        int bitmask=~(1<<ith);
        no=no&bitmask;
        System.out.println(no);
    }
    public static void updateIthbit(int no,int bit,int ith){
        if (bit==0){
            int bitmask=~(1<<ith);
            no=no&bitmask;
            System.out.println(no);
        }else{
            int bitmask=(1<<ith);
            no=no|bitmask;
            System.out.println(no);
        }
    }
    public static void clearLastithbits(int no,int ith){
        int bitmask=(~(0)<<ith);
        no=no&bitmask;
        System.out.println(no);

    }
    public static void Clearibits(int no,int i,int j){
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitmask=a|b;
        System.out.println(no&bitmask);
        
    }
    public static void ispowerof2(int n){
        int bitmask=n&(n-1);
        if(bitmask==0){
            System.out.println("no is power of two");
        }
        else{
            System.out.println("no is not power of two");
        }
    }
    public static void countnoOfsetbits(int n){
        int count=0;
        while(n>0){
            if((n&1)!=0 ){
                count++;
            }
            n=n>>1;
        }
        System.out.println("Total no of set bits= "+count);
    }
    public static void swaptwono(int x,int y){
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println(x);
        System.out.println(y);

    }
    public static void main(String[] args) {
        int i=21;
        oddeven(i);
        //System.out.println(i&1);
        getithbit(4, 1);
        setithbit(4, 0);
        clearithbit(10, 3);
        updateIthbit(12, 0, 2);
        clearLastithbits(15, 4);
        Clearibits(10, 2, 4);
        ispowerof2(8);
        countnoOfsetbits(11);
        swaptwono(10, 20);


    }
}
