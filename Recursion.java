

public class Recursion {
    public static int factorial(int no){
        if(no==0){
            return 1;
        }
        else{
            return no*factorial(no-1);
        }
    }
    public static void printDecno(int n){
        if(n==1){
            System.out.println("1");
            return ;
        }
        System.out.println(n);
        printDecno(n-1);
    }
    public static void printIncno(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printIncno(n-1);
        System.out.println(n);
    }
    public static int Sum(int n) {
        if(n==1){
            return 1;
        }
        return n+Sum(n-1);
    }
    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        return  fibonacci(n-1)+fibonacci(n-2);
        
    }
    public static boolean Sorted(int i,int arr[]){
        if(i==arr.length-2 && arr[arr.length-2]<arr[arr.length-1]){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return Sorted(i+1, arr);

    }

    public static void main(String [] args){
        System.out.println(factorial(5));

        printDecno(10);
        printIncno(10);
        System.out.println(Sum(10 ));
        System.out.println(fibonacci(7));
        int arr[]={1,2,6,4,5};
        System.out.println(Sorted(0,arr ));
        System.out.println("hello");


    }
}
