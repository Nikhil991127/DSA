

public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null; 
        }
    }
    public static Node Head;
    public static Node Tail;
    public static int size;
    public void addFirst(int data){
        Node newnode=new Node(data);
        if(Head==null){
            size++;
            Head=Tail=newnode;
            return;
        }
        size++;
        newnode.next=Head;
        Head=newnode;
    }
    public void addlast(int data){
        Node newnode=new Node(data);
        if(Head==null){
           Head=Tail=newnode;
           size++;
           return; 
        }
        size++;
        Tail.next=newnode;
        Tail=newnode;
    }
    public void print(){
        if(Head==null){
            System.out.println("ll is empty");
        }
        Node temp=Head;
        while(temp!=null){
            System.out.print(temp.data+"-> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void add(int idx,int data){
        Node newnode=new Node(data);
        int i=0;
        Node temp=Head;
        
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        size++;
        newnode.next=temp.next;
        temp.next=newnode;


    }
    public  void sizeof(){
        if(Head==null){
            System.out.println("0");
        }
        Node temp=Head;
        int count=0;
        
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        System.out.println(count);
    }
    public int removefirst(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=Head.data;
            size--;
            Head=Tail=null;
            return val;
        }
        int val=Head.data;
        Head=Head.next;
        size--;
        return val;
    }
    public int removelast(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MAX_VALUE;
        }
        if(size==1){
            int val =Head.data;
            Head=Tail=null;
            size--;
            return val;
        }
        Node temp=Head;
        while(temp.next!=Tail){
            temp=temp.next;
        }
        int val=temp.next.data;
        temp.next=null;
        Tail=temp;
        size--;
        return val;

    }
    public static int search(int target){
        if(size==0){
            System.out.println("ll is empty");
            return -1;
        }
        Node temp=Head;
        for(int i=0;i<=size-1;i++){
            if(temp.data==target){
                return i;
            }
            temp=temp.next;
        }
        return -1;
    }
    public static int recsearch(Node n,int target,int idx){
        if(n==null){
            return -1;
        }
        if(n.data==target){
            return idx;
        }
        idx++;
        return recsearch(n.next, target, idx++);

    }
    public void reverse(){
        Node prev=null;
        Node curr=Tail=Head;
        Node next;
        //prev.next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Head=prev;
    }
    public void remove(int n){
        
        if(n==size){
            Head=Head.next;
            size--;
            return;
        }
        int sz=size-n;
        Node temp=Head;
        for(int i=1;i<sz;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;
        return;
    }
    public static Node mid(){
        Node slow=Head;
        Node fast=Head;
        while(fast!=null&& fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static boolean plaindrome(Node n ){
        if(n==null||n.next==null){
            return true;
        }
        ///mid 
        Node mid=mid();
        //reverse
        Node prev=null;
        Node curr=mid;
        Node next;
        //prev.next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=Head;
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static boolean detectcycle(){
        if(Head==null|| Head.next==null){
            return false;
        }
        Node slow=Head;
        Node fast=Head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addlast(6);
        ll.addlast(4);
        //ll.print();
        /*ll.add(2, 6);
        System.out.println(ll.size);
        ll.addFirst(10);
        System.out.println(ll.size);
        ll.print();*/
        ll.print();
        /*System.out.println(ll.size);
       // System.out.println(ll.removelast());
        System.out.println(ll.size);

        int idx=search(12);
        if(idx==-1){
            System.out.println("element is not in the list");
        }
        else{
            System.out.println("the item is prest at "+(idx+1)+" postion");
        }
        System.out.println(recsearch(Head, 5, 0));
        ll.reverse();
        ll.print();
        ll.remove(4);
        ll.print();*/
        //System.out.println(plaindrome(Head));
        System.out.println(detectcycle());
        Tail.next=Head.next.next;
        System.out.println(detectcycle());
    }
}
