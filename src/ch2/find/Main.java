package ch2.find;

import ch2.find.Binary.BinarySearch;
import ch2.find.Liner.LinerSearch;

public class Main {
    private static final int max = 15;

    public static void main(String[] args) {
        testLinerSearch();
        testBinarySearch();
    }

    private static void testLinerSearch(){
        LinerSearch linerSearch = new LinerSearch(max);
        insertData(linerSearch);

        if (linerSearch.find(66)){
            System.out.println("Find element");
        } else {
            System.out.println("Can't find");
        }

        linerSearch.delete(99);
        linerSearch.display();
    }

    private static void testBinarySearch(){
        BinarySearch search = new BinarySearch(max);
        insertData(search);
        search.insert(3);
        search.display();

        System.out.println(search.find(33));
    }

    private static void insertData(Search search){
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
    }
}
