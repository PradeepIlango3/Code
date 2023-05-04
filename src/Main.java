public class Main {
    public static void main(String[] args) {

        //Stack
        MyStack myStack = new MyStack();
        myStack.add(5);
        System.out.println(myStack.top());
        System.out.println(myStack.pop());
        System.out.println(myStack.size());
        myStack.add(5);
        myStack.add(4);
        System.out.println(myStack.top());
        myStack.add(3);
        myStack.add(2);
        myStack.add(1);
        System.out.println(myStack.top());
        System.out.println(myStack.size());

        //Queue
        MyQueue myQueue = new MyQueue(10);
        myQueue.enqueue(5);
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        myQueue.enqueue(3);
        myQueue.enqueue(2);
    }
}
