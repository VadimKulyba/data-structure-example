package ch2.find.Liner;

public class HighArrayApp {
    public static void main(String[] args){
        int max = 15;
        HighArray arr = new HighArray(max);

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(0);
        arr.insert(66);
        arr.insert(33);

        arr.display();

        if (arr.find(66)){
            System.out.println("Find element");
        } else {
            System.out.println("Can't find");
        }

        arr.delete(99);
        arr.display();
    }
}
