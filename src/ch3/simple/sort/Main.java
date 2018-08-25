package ch3.simple.sort;

import ch3.simple.sort.select.SelectSort;

public class Main {

    public static void main(String[] args) {
        SelectSort search = new SelectSort(15);

        search.insert(77);
        search.insert(99);
        search.insert(44);
        search.insert(55);
        search.insert(22);
        search.insert(88);
        search.insert(11);
        search.insert(0);
        search.insert(66);
        search.insert(33);

        search.display();

        search.sort();

        search.display();
    }
}
