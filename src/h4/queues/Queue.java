package h4.queues;

public class Queue {
    private int maxSize;
    private int[] queArray;
    private int front;
    private int rear;
    private int size;

    public Queue(int max) {
        maxSize = max;
        queArray = new int[maxSize];
        // abstract
        front = 0;
        rear = -1;
        size = 0;
    }

    public void insert(int element) {
        if (rear == maxSize - 1){
            rear = -1;
        }
        queArray[++rear] = element;// begin ++, after insert
        size++;
    }

    public int remove(){
        int temp = queArray[front++]; // insert, after ++
        if (front == maxSize){ // because ++
            front = 0;
        }
        size--;
        return temp;
    }

    public int peekFront(){
        return queArray[front];
    }

    public boolean isEmpty(){
        return (size == 0);
    }

    public boolean isFull() {
        return (size == maxSize);
    }

    public int getSize() {
        return size;
    }
}
