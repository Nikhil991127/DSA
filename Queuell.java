public class Queuell {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node Head=null;
    static Node Tail=null;
    public boolean isEmpty(){
        return Head==null && Tail==null;
    }
    public void add(int data){
        Node newnode=new Node(data);
        if(Head==null){
           Head=Tail=newnode;
           return; 
        }
        Tail.next=newnode;
        Tail=newnode;
    }
    public void remove(){
        if (Head==null && Tail==null){
            System.out.println("queue is empty");
        }
        else if(Head.next==null){
            Head=Tail=null;
        }
        //int val=Head.data;
        else{
            Head=Head.next;
        }
    }
    public  int peek(){
        if (Head==null){
            return -1;
        }
        return Head.data;
    }
    public static void main(String[] args) {
        Queuell q=new Queuell();
        q.add(5);
        q.add(6);
        q.add(7);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
