package id.college;

public class SingleLinkedList {

    // properties
    private SingleLinkedList LinkedList;
    private Node head;
    private Node tail;

    // constructor
    SingleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // methods
    public void display() {
        Node curr = this.head;
        while( curr != null ) {
            System.out.println(curr.getData());
            curr = curr.getNext();
        }
    }

    public Integer countSingleLinkedList() {
        Node curr = this.head;
        Integer count = 0;
        while(curr != null) {
            curr = curr.getNext();
            count++;
        }
        return count;
    }

    public void createSingleLinkedList(String data) {
        this.head = new Node(data);
        this.tail = this.head;
    }

    public void insertFirst(String data) {
        Node newNode = new Node(data);
        newNode.setNext(this.head);
        this.head = newNode;
    }

    public void insertLast(String data) {
        Node newNode = new Node(data);
        this.tail.setNext(newNode);
        this.tail = newNode;

//        if(this.head == null) {
//            this.head = new Node(data);
//            return;
//        }
//
//        this.tail = this.head;
//        while(this.tail.getNext() != null) {
//            this.tail = this.tail.getNext();
//        }
//
//        this.tail.setNext(newNode);
//        return;
    }

    public void insertIn(String data, Integer position) {
        if(position < 1 || position > countSingleLinkedList()) {
            System.out.println("Position is out of range");
        } else if(position == 1 || position == countSingleLinkedList()) {
            if(position == 1) {
                this.insertFirst(data);
            } else {
                this.insertLast(data);
            }
        } else {
            Node newNode = new Node(data);
            Node curr    = this.head;
            Integer counter = 1;
            while(counter < position-1) {
                curr = curr.getNext();
                counter++;
            }
            newNode.setNext(curr.getNext());
            curr.setNext(newNode);
        }
    }

    public void deleteFirst() {
        Node del = this.head;
        this.head = del.getNext();
        del = null;
    }

    public void deleteLast() {
        Node curr = this.head;
        Node del  = this.tail;
        while( curr.getNext() != this.tail ) {
            curr = curr.getNext();
        }
        this.tail = curr;
        curr.setNext(null);
        del = null;

    }

    public void deleteIn(Integer position) {
        if(position < 1 || position > countSingleLinkedList()) {
            System.out.println("Position is out of range");
        } else if(position == 1 || position == countSingleLinkedList()) {
            if(position == 1) {
                this.deleteFirst();
            } else {
                this.deleteLast();
            }
        } else {
            Integer counter = 1;
            Node curr = this.head;
            Node before = new Node();
            Node del = new Node();
            while(counter <= position) {
                if(counter == position-1) {
                    before = curr;
                }
                if(counter == position) {
                    del = curr;
                }
                curr = curr.getNext();
                counter++;
            }
            before.setNext(curr);
            del = null;
        }
    }

    // encapsulation
    public void setHeadValue(String data) {
        this.head.setData(data);
    }
    public void setTailValue(String data) {
        this.tail.setData(data);
    }

    public Node getHead() { return this.head; }
    public Node getTail() { return this.tail; }

}
