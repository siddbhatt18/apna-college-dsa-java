public class ArrayQueue {
    public static class Queue {
        int arr[];
        int size;
        int front;
        int rear;
        public Queue(int n) {
            arr = new int[n];
            size = n;
            front = 0;
            rear = -1;
        }
        public boolean isEmpty() {
            if(rear == -1) {
                return true;
            }
            else {
                return false;
            }
        }
        public boolean isFull() {
            if(rear == size - 1) {
                return true;
            }
            else {
                return false;
            }
        }
        public void add(int data) {
            if(isFull() == true) {
                System.out.println("full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }
        public int remove() {
            if(isEmpty() == true) {
                System.out.println("empty");
                return -1;
            }
            int result = arr[0];
            for(int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;
            return result;
        }
        public int peek() {
            if(isEmpty() == true) {
                System.out.println("empty");
                return -1;
            }
            int result = arr[0];
            return result;
        }
    }
    public static void main(String[] args) {
        Queue que = new Queue(3);
        que.add(1);
        que.add(2);
        que.add(3);
        while(que.isEmpty() != true) {
            System.out.println(que.remove());
        }
    }
}