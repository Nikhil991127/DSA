public class Recursion2 {
    public static int tilling_problem(int n){
        if(n<=0||n==1){
            return 1;
        }
        //vertical
        int fnm1=tilling_problem(n-1);
        //horizontal
        int fnm2=tilling_problem(n-2);
    
        int totalways=fnm1+fnm2;
        return totalways;
    }
    public static void duplicateString(int idx,String str,StringBuilder newStr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return ;
        }
        char currchar=str.charAt(idx);
        if(map[currchar-'a']==true){
            duplicateString(idx +1, str, newStr, map);
        }
        else{
            map[currchar-'a']=true;
            duplicateString(idx+1, str, newStr.append(currchar), map);
        }

    }
    public static int friends(int n){
        if(n==1||n==2){
            return n;
        }
        int single=friends(n-1);
        int pair=(n-1)*friends(n-2);
        int totalnoofways=single + pair;
        return totalnoofways;
    }
    public static void print(int n,int lastplace,String str){
        if(n==0){
            System.out.println(str);
        }
        else{
            print(n-1, 0, str+"0");
            if(lastplace==0){
            print(n-1, 1, str+"1");
        }}
    }
    public static void main(String[] args) {
        System.out.println(tilling_problem(4));
        duplicateString(0, "appnacollege", new StringBuilder(" "), new boolean[26]);
        System.out.println(friends(5));
        print(4, 0, "");
    }
}
