package ch3.simple.sort.select;

public class SelectSort {
    private int[] array;
    private int size;

    public SelectSort(int max) {
        array = new int[max];
        size = 0;
    }

    public void insert(int element){
        array[size] = element;
        size++;
    }

    public void sort(){
        int out, in, min;
        for (out = 0; out < size; out++){
            min = out;
            // left min element
            for (in = out + 1; in < size; in++){
                if (array[in] < array[min]){
                    swap(in, min);
                }
            }
        }
    }

    private void swap(int one, int two){
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
