
import java.util.Stack;

public class StackQ {
    
    public static void bottom(Stack<Integer> s ,int val){
        if(s.isEmpty()){
            s.push(val);
            return ;
        }
        int v=s.pop();
        bottom(s, val);
        s.push(v);
    }
    public static String reverseString(String str){
        Stack<Character> ch =new Stack<>();
        for(int i=0;i<str.length();i++){
            ch.push(str.charAt(i));
        }
        StringBuilder sb=new StringBuilder("");
        while(!ch.isEmpty()){
            char character=ch.pop();
            sb.append(character);
        }
        return sb.toString();
    }
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int val=s.pop();
        reverse(s);
        bottom(s, val);
    }
    public static void Stockspan(int stocks[],int span[] ){
        Stack<Integer> s=new Stack<>();
        span[0]=1;
        s.push(0);
        int i=1;
        while(i<stocks.length&&!s.isEmpty()){
            if(stocks[i]<=stocks[s.peek()]){
                span[i]= i-s.peek();
                s.push(i);
                i++;
            }
            else{
                s.pop();
            }
        }

    } 
    public static void nextgreater(int number[],int nxtgreater[]){
        Stack<Integer> s=new Stack<>();
        for(int i=number.length-1;i>=0;i--){
            while(!s.isEmpty()&&number[s.peek()]<=number[i] ){
                s.pop();
            }
            if(s.isEmpty()){
                nxtgreater[i]=-1;
            }
            else{
                nxtgreater[i]=number[s.peek()];
            }
            s.push(i);
        }
    }
    public static boolean isValid(String str){
        Stack<Character> ch= new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='{'||str.charAt(i)=='('||str.charAt(i)=='['){
                ch.push(str.charAt(i));
            }
            else{
                if(ch.isEmpty()){
                    return false;
                }
                else{
                    if((ch.peek()=='{'&&str.charAt(i)=='}')||(ch.peek()=='['&&str.charAt(i)==']')||(ch.peek()=='('&&str.charAt(i)==')')){
                        ch.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        if(ch.isEmpty()){
            return true;
        }
        return false;
    }
    public static void main (String[] args){
        /*Stack<Integer> s=new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek());
        //System.out.println(s.pop());
        //bottom(s,10);
        System.out.println(s);
        reverse(s);
        System.out.println(s);
        System.out.println(reverseString("Helloworld"));
        int stocks[]={100,80,60,70,60,85,100};
        int span[]=new int[stocks.length];
        Stockspan(stocks, span);
        for(int i=0;i<span.length;i++){
            System.out.print(span[i]+" ");
        }
        System.out.println("");
        int number[]={6,8,0,1,3};
        int nxtgreater[]=new int[number.length];
        nextgreater(number, nxtgreater);
        for(int i=0;i<nxtgreater.length;i++){
            System.out.print(nxtgreater[i]);
        }
        System.out.println("");*/
        System.out.println(isValid("{[()]}"));
    }
}
