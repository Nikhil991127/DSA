import java.util.*;

public class Qquestion {
    public static void printnonrepeating(String str){
        int freq[] = new int[26];
        Queue<Character> q = new java.util.LinkedList<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            freq[ch - 'a']++;
            q.add(ch);

            while(!q.isEmpty() && freq[q.peek() - 'a'] > 1){
                q.remove();
            }

            if(q.isEmpty()){
                System.out.println("-1");
            } else {
                System.out.println(q.peek());
            }
        }
    }
    public static void interLeave(Queue<Integer> q){
        int size=q.size();
        System.out.println(size/2);
        Queue<Integer> first=new java.util.LinkedList<>();
        for(int i=0;i<size/2;i++){
            first.add(q.remove());
        }
        while(!first.isEmpty()){
            q.add(first.remove());
            q.add(q.remove());
        } 
    }
    public static void reversal(Queue<Integer> q){
        Stack<Integer> s= new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }

    public static void main(String[] args){
        //printnonrepeating("aabccxb");
        Queue<Integer> q=new java.util.LinkedList<>();
         q.add(1);   
         q.add(2);   
         q.add(3);   
         q.add(4);   
         q.add(5);   
         q.add(6);   
         q.add(7);   
         q.add(8);   
         q.add(9);   
         q.add(10); 
        // interLeave(q);
        reversal(q);
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
        System.out.println("");    
    }
}

