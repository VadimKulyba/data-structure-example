package ch3.simple.sort.bubble;

public class BubbleSort {
    private int[] array;
    private int size;

    public BubbleSort(int max) {
        array = new int[max];
        size = 0;
    }

    public void insert(int element){
        array[size] = element;
        size++;
    }

    public void sort(){
        int out, in;
        // max element on right (as bubble)
        for (out = size - 1; out > 1; out--){
            for (in = 0; in < out; in++){
                if (array[in] > array[in + 1]){
                    swap(in, in + 1);
                }
            }
        }
    }

    public void swap(int one, int two){
        int temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }

    public void display(){
        for (int index = 0; index < size; index++){
            System.out.println(array[index]);
        }
    }
}
