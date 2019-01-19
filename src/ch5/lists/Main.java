package ch5.lists;

import ch5.lists.main.LinkList;
import ch5.lists.sort.SortLinkList;

public class Main {
    public static void main(String[] args){
        LinkList theList = new LinkList();
        theList.insertFirst(22, 2.99);
        theList.insertFirst(44, 4.99);
        theList.insertFirst(66, 6.99);
        theList.insertFirst(88, 8.99);

        theList.deleteFirst();
        theList.find(44);
        theList.delete(44);

        SortLinkList sortLinkList = new SortLinkList();
        sortLinkList.insert(44, 2.99);
        sortLinkList.insert(22, 4.99);
        sortLinkList.insert(88, 6.99);
        sortLinkList.insert(66, 8.99);

        sortLinkList.display();
    }
}
