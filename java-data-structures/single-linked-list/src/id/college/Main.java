package id.college;

public class Main {

    public static void main(String[] args) {

        SingleLinkedList llist = new SingleLinkedList();

        llist.createSingleLinkedList("A");
        llist.insertFirst("X");
        llist.insertLast("B");
        llist.insertLast("C");

        llist.deleteFirst();
//        llist.deleteLast();
        llist.insertIn("A1", 3);
        llist.insertIn("X", 3);
        llist.insertFirst("XX");
        llist.deleteIn(6);

        llist.display();
        System.out.println(llist.countSingleLinkedList());

    }
}
