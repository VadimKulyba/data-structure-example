package ch2.find.Binary;

public class BinarySearch {
    private int[] array;
    private int size;

    public BinarySearch(int max) {
        array = new int[max];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public int find(int searchElement){
        int lowBoard = 0;
        int highBoard = size - 1;
        int current;

        // binary search
        while (true) {
            current = (highBoard + lowBoard) / 2;
            if (array[current] == searchElement){
                return current;
            } else if (lowBoard > highBoard){
                return size;
            }
            else {
                if (searchElement > array[current]) {
                    lowBoard = current + 1;
                } else {
                    highBoard = current - 1;
                }
            }
        }
    }

    public void insert(int element){
        int index;
        for (index = 0; index < size; index++){
            if (array[index] > element) {
                break;
            }
        }
        // go from end, because not delete element
        for (int endIndex = size; endIndex > index; endIndex--){
            array[endIndex] = array[endIndex - 1];
        }
        array[index] = element;
        size++;
    }

    public void display(){
        for (int index = 0; index < size; index++){
            System.out.println(array[index]);
        }
    }
}
