public class Backtracking {
    public static void print(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        
    }
    public static void Assign( int idx,int arr[]){
        if(idx==arr.length){
            return ;
        }
        arr[idx]=idx+1;
        Assign(idx+1, arr);
        arr[idx]=arr[idx]-2;
    }
    public static void  substring(String str ,String ans,int i){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
                return;
            }
            else{
                System.out.println(ans);
                return;
            }
            
        }
        substring(str, ans+str.charAt(i), i+1);
        substring(str, ans, i+1);
    }
    public static void permutation(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return ;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String Newstr= str.substring(0,i)+str.substring(i+1);
            permutation(Newstr, ans+ch);
        }
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        Assign(0, arr);
        print(arr);
        substring("abc", "", 0);
        permutation("abc", "");
        
    }
}
