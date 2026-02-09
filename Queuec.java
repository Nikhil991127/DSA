public class Queuec {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
            Queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;
        }
        public boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        public boolean isFull(){
            return (rear+1)%size==front;
        }

        public void add(int n){
            if(isFull()){
                System.out.println("queue is full");
                return;
            }
            if (front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=n;
        }
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[front];
        }
        public int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int no=arr[front];
            if(front==rear){
                front=rear=-1;
            }else{
                front=(front+1)%size;
            }
            return no;
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(3);
        q.remove();
        q.add(3);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}

