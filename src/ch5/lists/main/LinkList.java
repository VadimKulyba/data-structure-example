package ch5.lists.main;

import ch5.lists.Link;

public class LinkList {
    private Link first;

    public LinkList() {
        this.first = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst(int index, double data){
        Link newLink = new Link(index, data);
        newLink.next = first;
        this.first = newLink;
    }

    public Link find(int index){
        Link current = first;
        while (current != null){
            if (current.iData == index){
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public Link deleteFirst(){
        Link temp = first;
        first = first.next;
        return temp;
    }

    public Link delete(int index){
        Link current = first;
        Link prev = null;
        while (current != null){
            if (current.iData == index){
                prev.next = current.next;
                return current;
            }
            prev = current;
            current = current.next;
        }
        return null;
    }

    public void display(){
        Link current = first;
        while (current != null){
            System.out.println(current);
            current = current.next;
        }
    }
}
