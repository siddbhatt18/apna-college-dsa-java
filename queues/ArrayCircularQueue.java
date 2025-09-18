public class ArrayCircularQueue {
    public static class CircularQueue {
        int arr[];
        int size;
        int front;
        int rear;
        public CircularQueue(int n) {
            arr = new int[n];
            size = n;
            front = -1;
            rear = -1;
        }
        public boolean isEmpty() {
            if(front == -1 && rear == -1) {
                return true;
            }
            else {
                return false;
            }
        }
        public boolean isFull() {
            if((rear + 1) % size == front) {
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
            if(front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }
        public int remove() {
            if(isEmpty() == true) {
                System.out.println("empty");
                return -1;
            }
            int result = arr[front];
            if(front == rear) {
                front = -1;
                rear = -1;
            }
            else {
                front = (front + 1) % size;
            }
            return result;
        }
        public int peek() {
            if(isEmpty() == true) {
                System.out.println("empty");
                return -1;
            }
            int result = arr[front];
            return result;
        }
    }
    public static void main(String[] args) {
        CircularQueue cque = new CircularQueue(3);
        cque.add(1);
        cque.add(2);
        cque.add(3);
        System.out.println(cque.remove());
        cque.add(4);
        System.out.println(cque.remove());
        cque.add(5);
        while(cque.isEmpty() != true) {
            System.out.println(cque.remove());
        }
    }
}