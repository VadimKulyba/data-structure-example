package h4.queues;

public class PriorityQ {
    private int maxSize;
    private int[] queArray;
    private int size;

    public PriorityQ(int maxSize) {
        this.maxSize = maxSize;
        queArray = new int[maxSize];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void insert(int element){
        int index;
        if (size == 0){
            queArray[size] = element;
            size++;
        } else { // max element have index 0,
            // min(most important)// element have index size - 1
            for (index = size - 1; index >= 0; index--){
                if (queArray[index] < element){
                    queArray[index + 1] = queArray[index];
                }
                else {
                    break;
                }
            }
            queArray[index + 1] = element;
            size++;
        }
    }

    public int remove(){
        return queArray[--size];
    }

    public int peekImportantLast() {
        return  queArray[size - 1];
    }

    public boolean isEmpty(){
        return (size == 0);
    }

    public boolean isFull() {
        return (size == maxSize);
    }
}
