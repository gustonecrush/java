package id.college;

public class Main {

    public static void main(String[] args) {

        DoubleLinkedList llist = new DoubleLinkedList("A");
        llist.insertLast("B");
        llist.insertLast("C");
//        DoubleLinkedList llist = new DoubleLinkedList();
//        llist.deleteFirst ();
//        llist.deleteFirst();
//        llist.deleteLast();
//        llist.deleteLast();
        llist.insertIn("X", 2);
        llist.deleteIn(3);
        llist.display();
//
//        System.out.println(llist.getHead().getPrev() + " | " + llist.getHead().getNext() );

    }

}
