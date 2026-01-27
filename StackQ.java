
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
    public static void main (String[] args){
        Stack<Integer> s=new Stack<>();
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
    }
}
