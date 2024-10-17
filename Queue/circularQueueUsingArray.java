public class circularQueueUsingArray {
    public static class circularQueue{
        int front=-1;
        int rear=-1;
        int size=0;
        int arr[]=new int[5];
        public void push(int data)throws Exception{
            if(size==arr.length){// queue is full
                throw new Exception("Queue is full.");
            } else if(size==0){// queue is empty
                front=rear=0;
                arr[0]=data;
            } else if(rear<arr.length-1){// normal case
                arr[++rear]=data;
            } else if(rear==arr.length-1){
                rear=0;
                arr[0]=data;
            }
            size++;
        }
        public int pop()throws Exception{
            if(size==0){
                throw new Exception("Queue underFlow.");
            }
            else{
                int value=arr[front];
                if(front==arr.length-1) front=0;
                else front++;
                size--;
                return value;
            }
        }
        public int peek()throws Exception{
            if(size==0){
                throw new Exception("Queue is Empty.");
            }
            else return arr[front];
        }
        public boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is empty");
                return;
            }
            else if(front<=rear){
                for (int i=0; i<=rear; i++){
                    System.out.print(arr[i]+" ");
                }
            } else{     // rear<front
                for (int i=front; i<arr.length; i++){
                    System.out.print(arr[i]+" ");
                }
                for (int i=0; i<=rear; i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args)throws Exception{
        circularQueue q=new circularQueue();
        q.display();    // empty
        q.push(32);
        q.push(34);
        q.push(33);
        q.pop();
        q.display();    // 32 34 33
        q.push(35);
        q.display();   // 32 34 33 35
        q.pop();
        q.pop();
        q.display();   // 33 35
        System.out.println(q.size);
        System.out.println(q.peek());
        q.display();
        q.push(36);
        q.display(); // 32 34 33 35 36
        System.out.println(q.size);
        q.push(3);
        q.push(12);
        q.push(331);
        q.push(352);    // will throw exception
    }
}