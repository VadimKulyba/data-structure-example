package ch2.find.Liner;

import ch2.find.Search;

public class LinerSearch extends Search {
    private int[] array;
    private int size;

    public LinerSearch(int max) {
        array = new int[max];
        size = 0;
    }

    public boolean find(int searchElement){
        // liner
        for (int index = 0; index < size; index++){
            if (array[index] == searchElement){
                return true;
            }
        }
        return false;
    }

    public void insert(int element){
        array[size] = element;
        size++;
    }

    public boolean delete(int element){
        int index;
        for (index = 0; index < size; index++){
            if (array[index] == element)
                break;
        }
        if (index == size) {
            return false;
        } else {
            for (int k = index; k < size; k++){
                array[k] = array[k + 1];
            }
            size--;
            return true;
        }
    }

    public void display(){
        for (int index = 0; index < size; index++){
            System.out.println(array[index]);
        }
    }
}
