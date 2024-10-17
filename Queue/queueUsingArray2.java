public class queueUsingArray2{
    public class queue{
        int front=-1;
        int rear=-1;
        int size=0;
        int arr[]=new int[5];
        public void push(int data){
            if(rear==arr.length-1){
                System.out.println("Queue overFlow.");
                return;
            }
            if(front==-1){
                front++;
            }
            arr[++rear]=data;
            size++;
        }
        public void pop()throws Exception{
            if(size==0){
                throw new Exception("Queue underFlow.");
            }
            front++;
            size--;
        }
        public int peek()throws Exception{
            if(isEmpty()){
                throw new Exception("Queue is Empty.");
            }
            return arr[front];
        }
        public boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is Empty.");
                return;
            }
            for (int i=front; i<=rear; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)throws Exception{
        queueUsingArray2.queue q=new queueUsingArray2().new queue();
        System.out.println(q.isEmpty());
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        q.display();
        System.out.println(q.size);
        System.out.println(q.isEmpty());
        System.out.println(q.peek());
        q.pop();
        q.pop();
        q.display();
        System.out.println(q.peek());
        System.out.println(q.size);
        q.push(6);
        q.push(7);
        q.display();
        q.push(8);
        q.display();
    }
}