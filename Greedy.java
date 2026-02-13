
import java.util.Arrays;
import java.util.Comparator;



public class Greedy {
    public static void main(String[] args){
        /*int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        //sorting
        int activites[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activites[i][0]=i;
            activites[i][1]=start[i];
            activites[i][2]=end[i];
        }
        //lambda functionn
        Arrays.sort(activites,Comparator.comparingDouble(o->o[2]));
        ArrayList<Integer> ans= new ArrayList<>();
        int maxact=0;
        maxact=1;
        ans.add(activites[0][0]);
        int lastend=activites[0][2];
        for(int i=1;i<end.length;i++){
            if(activites[i][1]>=lastend){
                maxact++;
                ans.add(activites[i][0]);
                lastend=activites[i][2];
            }
        }
        System.out.println("total no of activites ="+maxact);
        for(int i=0;i<ans.size();i++){
            System.out.println("A"+ans.get(i));
        }*/
       //knapsack problem
       int weight[]={10,20,30};
       int value[]={60,100,120};
       int capacity=50;
       double ratio[][]=new double[weight.length][2];
       for(int i=0;i<weight.length;i++){
         ratio[i][0]=i;
         ratio[i][1]=(double)value[i]/(double)weight[i];
       }
       Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
       int finalval=0;
       for(int i=weight.length-1;i>=0;i--){
        int idx=(int) ratio[i][0];
        if(capacity>=weight[idx]){
            finalval+=value[idx];
            //System.out.println(finalval);
            capacity-=weight[idx];
        }
        else{
            finalval+=(capacity*ratio[i][1]);
            capacity=0;
        }
       }
       System.out.println(finalval);
    }
}
