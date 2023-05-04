public class MyQueue {

    int[] data;
    int size;
    int front;
    int rear;

    public MyQueue(int size) {
        this.size = size;
        data = new int[size];
        front = -1;
        rear = -1;
    }

    public boolean enqueue(int x) {
        if (isFull()) {
            return false;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % size;
        data[rear] = x;
        return true;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return ((rear+1) % size) == front;
    }

    public boolean dequeue() {
        if (isEmpty()) {
            return false;
        }
        if (front == rear) {
            front = -1;
            rear = -1;
            return true;
        }
        front = (front + 1) % size;
        return true;
    }
}
