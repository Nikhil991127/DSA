
import java.util.Scanner;

public class TwoDArray {
    public static void Spiral(int matrix[][]){
        int startcol=0;
        int startrow=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;
        while(startcol<=endcol &&startrow<=endrow){
            //right
            for(int i=startcol;i<=endcol;i++){
                System.out.println(matrix[startrow][i]);
            }
            //
            for(int i=startrow+1;i<=endrow;i++){
                System.out.println(matrix[i][endcol]);
            }
            //
            for(int i=endcol-1;i>=startcol;i--){
                if(startrow==endrow){
                    break;
                }
                System.out.println(matrix[endrow][i]);
            }
            //
            for(int i=endrow-1;i>=startrow+1;i--){
                if(startcol==endcol){
                    break;
                }
                System.out.println(matrix[i][startcol]);
            }
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
    }
    public static int diagonalsum(int matrix[][]){
        int sum=0;
        if (matrix.length==matrix[0].length){
            for(int i=0;i<matrix.length;i++){
                sum+=matrix[i][i];
                if(i!=matrix.length-i-1){
                    sum+=matrix[i][matrix.length-i-1];
                }
            }
            return sum;
        }
        else{
            return -1;
        }
    }
    public static boolean search(int mat[][],int target){
        int row=0;
        int col= mat.length-1;
        while(row>=0&&row<=mat.length&&col>=0&&col<=mat[0].length){
            if(mat[row][col]==target){
                System.out.println("item found at ("+row+","+col+")");
                return true;
            }
            else if(target>mat[row][col]){
                row++;
            }
            else{
                col--;
            }
        }
        return false;
    }
    public static void main(String [] args){
        int arr[][]=new int[4][4];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        Spiral(arr);
        System.out.println(diagonalsum(arr));
        System.err.println(search(arr, 33));
    }
}
