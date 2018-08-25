package ch2.find.Liner;

public class HighArray {
    private int[] array;
    private int nElems;

    public HighArray(int max) {
        array = new int[max];
        nElems = 0;
    }

    public boolean find(int searchElement){
        // liner
        for (int index = 0; index < nElems; index++){
            if (array[index] == searchElement){
                return true;
            }
        }
        return false;
    }

    public void insert(int element){
        array[nElems] = element;
        nElems++;
    }

    public boolean delete(int element){
        int index;
        for (index = 0; index < nElems; index++){
            if (array[index] == element)
                break;
        }
        if (index == nElems) {
            return false;
        } else {
            for (int k = index; k < nElems; k++){
                array[k] = array[k + 1];
            }
            nElems--;
            return true;
        }
    }

    public void display(){
        for (int index = 0; index < nElems; index++){
            System.out.println(array[index]);
        }
    }
}
