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
    public static void printsudoku(int Sudoku[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(Sudoku[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static boolean issafe(int Sudoku[][],int row,int col,int digit){
        //in row
        for(int i=0;i<9;i++){
            if(Sudoku[row][i]==digit){
                return false;
            }
            //in col
            if(Sudoku[i][col]==digit){
                return false;
            }
        }
        //in grid
        int sc=(col/3)*3;
        int sr=(row/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(Sudoku[i][j]==digit){
                    return false;
                }
            }
        }

        return true;
    }
    public static boolean Sudokusolver(int Sudoku[][],int row,int col){
        if(row==9){
            return true;
        }
        int nextcol=col+1;
        int nextrow=row;
        if(col+1==9){
            nextcol=0;
            nextrow=row+1;
        }
        if(Sudoku[row][col]!=0){
            return Sudokusolver(Sudoku, nextrow, nextcol);
        }
        for(int digit=1;digit<=9;digit++){
            if(issafe(Sudoku,row,col,digit)){
                Sudoku[row][col]=digit;
                if(Sudokusolver(Sudoku, nextrow, nextcol)){
                    return true;
                }
                Sudoku[row][col]=0;
            }
        }
        return false;
    }
    public static boolean mazeSolver(int maze[][],int i,int j){
        return true;
    }
    public static void main(String[] args) {
        /*int arr[]=new int[5];
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
        System.out.println(gridways(0, 0, 4, 4));*/
        /*int sudoku[][]={{0,0,8,0,0,0,0,0,0},
        {4,9,0,1,5,7,0,0,2},
        {0,0,3,0,0,4,1,9,0},
        {1,8,5,0,6,0,0,2,0},
        {0,0,0,0,2,0,0,6,0},
        {9,6,0,4,0,5,3,0,0},
        {0,3,0,0,7,2,0,0,4},
        {0,4,9,0,3,0,0,5,7},
        {8,2,7,0,0,9,0,1,3}};
        if(Sudokusolver(sudoku, 0, 0)){
            System.out.println("solution exist");
            printsudoku(sudoku);
        }*/
        
    }
}
