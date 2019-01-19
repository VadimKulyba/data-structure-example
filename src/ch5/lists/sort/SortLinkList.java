package ch5.lists.sort;

import ch5.lists.Link;

public class SortLinkList {
    private Link first;

    public SortLinkList() {
        this.first = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insert(int index,  double value){
        Link newLink = new Link(index, value);
        Link current = first;
        Link prev = null;

        while (current != null && current.iData > index){
            prev = current;
            current = current.next;
        }

        if (prev == null){
            first = newLink;
        } else
            prev.next = newLink;
        newLink.next = current;
    }

    public void display(){
        Link current = first;
        while (current != null){
            System.out.println(current);
            current = current.next;
        }
    }
}
