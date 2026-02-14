import java.util.*;

/*class job{
    int id; 
    int deadline;
    int profit;
    public job(int i,int d,int p){
        id=i;
        deadline=d;
        profit=p;
    }
}*/
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
       /*int weight[]={10,20,30};
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
       System.out.println(finalval);*/
       //min absolute diffrence
       /*int A[]={1,2,3};
       int B[]={2,1,3};
       Arrays.sort(A);
       Arrays.sort(B);
       int mindif=0;
       for(int i=0;i<A.length;i++){
        mindif+= Math.abs(A[i]-B[i]);
       }
       System.out.println("The min absolute diffrence="+mindif); */
       //maximum length
       /*int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
       Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
       int chainlen=1;
       int chainend=pairs[0][1];
       for(int i=1;i<pairs.length;i++){
        if(pairs[i][0]>chainend){
            chainlen++;
            chainend=pairs[i][1];
        }
       }
       System.out.println("chain length ="+chainlen);*/

       //indian coins
       /*Integer coins[]={1,2,5,10,20,50,100,500};
       Arrays.sort(coins,Collections.reverseOrder());
       int value=121;
       int count=0;
       for(int i=0;i<coins.length;i++){
        if(coins[i]<=value){
            while(coins[i]<=value){
                count++;
                value=value-coins[i];
            }
        }
       }      
       System.out.println(count); */ 

       //job sequencing
       /*int jobinfo[][]={{4,20},{1,10},{1,40},{1,30}};

       ArrayList<job> jobs=new ArrayList<>();
       for(int i=0;i<jobinfo.length;i++){
        jobs.add(new job(i,jobinfo[i][0],jobinfo[i][1]));
       }
       Collections.sort(jobs,(obj1,obj2)->obj2.profit-obj1.profit);
       ArrayList<Integer> seq=new ArrayList<>();
       int time=0;
       for(int i=0;i<jobs.size();i++){
        job curr=jobs.get(i);
        if(curr.deadline>time){
            seq.add(curr.id);
            time++;
        }
       }
       System.err.println("max no of jobs ="+seq.size());
       for(int i=0;i<seq.size();i++){ 
        System.out.println(seq.get(i));
       }*/
      //choclate problem
      Integer chocver[]={2,1,3,1,4};
      Integer chochor[]={4,1,2};
      Arrays.sort(chochor,Collections.reverseOrder());
      Arrays.sort(chocver,Collections.reverseOrder());
      int h=0;
      int v=0;
      int hp=1;
      int vp=1;
      int cost=0;
      while(h<chochor.length &&v<chocver.length){
        if(chochor[h]>=chocver[v]){
            cost+=(chochor[h]*vp);
            hp++;
            h++;
        }
        else{
            cost+=(chocver[v]*hp);
            vp++;
            v++;
        }
    }
    while(h<chochor.length){
        cost+=(chochor[h]*vp);
        hp++;
        h++;
    }
    while(v<chocver.length){
        cost+=(chocver[v]*hp);
        vp++;
        v++;
    }
    System.out.println("the min mum cost="+cost);
    }

}
