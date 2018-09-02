package ch3.simple.sort;

import ch3.simple.sort.select.SelectSort;

public class Main {

    public static void main(String[] args) {
        testSelectSearch();
    }

    private static void testSelectSearch(){
        SelectSort sort = new SelectSort(15);

        sort.insert(77);
        sort.insert(99);
        sort.insert(44);
        sort.insert(55);
        sort.insert(22);
        sort.insert(88);
        sort.insert(11);
        sort.insert(0);
        sort.insert(66);
        sort.insert(33);

        sort.display();
        sort.sort();
        sort.display();
    }
}
