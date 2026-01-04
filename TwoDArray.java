
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
    public static void main(String [] args){
        int arr[][]=new int[3][4];
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
    }
}
