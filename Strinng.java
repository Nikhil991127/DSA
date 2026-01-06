public class Strinng {
   public static boolean isPlanedrome(String str){
    for(int i=0;i<str.length()-1/2;i++){
        if(str.charAt(i)!=str.charAt(str.length()-1-i)){
            return false;
        }
    }
    return true;
   }
   public static float ShortestPath(String str){
    int x=0;
    int y=0;
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='N'){
            y++;
        }
        else if(str.charAt(i)=='S'){
            y--;
        }
        else if(str.charAt(i)=='E'){
            x++;
        }
        else{
            x--;
        }
    }
    int x2=x*x;
    int y2=y*y;
    return (float)Math.sqrt(x2+y2);
   }
   public static boolean Angram(String str1,String str2){
    for(int i=0;i<str1.length();i++){
        if(str2.indexOf(str1.charAt(i))==-1){
            return false;
        }
    }
    return true;

   }
    public static void main(String[] args) {
    /*Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    System.out.print(str);
    System.out.println(isPlanedrome(str));
    String path="SSSWWWW";
    System.out.println(ShortestPath(path));*/
    String str1="race";
    String str2="caadas";
    System.out.println(Angram(str1, str2));
    
   }

}
