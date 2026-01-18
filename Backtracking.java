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
    public static void printboard(char board[][]){
        System.out.println("------Chess board--------");
        for(int i=0;i<board.length;i++){
            
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println("");
        }
        return ;
    }
    public static boolean isSafe(char board[][],int row,int j){
        //vertical
        for(int i=row;i>=0;i--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //horizontal
        for(int i=j;i>=0;i--){
            if(board[row][i]=='Q'){
                return false;
            }
        }
        //left diagonal
        int i,k;
        for(i=row-1,k=j-1;i>=0; i--,k--){
            if(k>=0&&board[i][k]=='Q'){
                return false;
            }
        }
        //right diagonal
        for(i=row-1,k=j+1;k<board.length; i--,k++){
            if(i>=0 && board[i][k]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void Nqueen(char board[][],int row ){
        if(row==board.length){
            printboard(board);
            return ;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board, row, j)){
                 board[row][j]='Q';
                 Nqueen(board, row+1);
                 board[row][j]='x';
            }
        }
    }
    public static int gridways(int i,int j,int m,int n){
        if(i==m-1||j==n-1){
            return 1;
        }
        if(i==m||j==n){
            return 0;
        }
        int w1=gridways(i+1, j, m, n);
        int w2=gridways(i, j+1, m, n);
        return w1+w2;
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        Assign(0, arr);
        print(arr);
        substring("abc", "", 0);
        permutation("abc", "");
        char board[][]=new char[5][5];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='x';
            }
        }
        Nqueen(board, 0);
        int grid[][]=new int[4][4];
        System.out.println(gridways(0, 0, 4, 4));
        
    }
}
