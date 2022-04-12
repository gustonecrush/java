package id.college;

public class DoubleLinkedList {

    // properties
    private Node head;
    private Node tail;

    // constructor
    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // overloading constructor
    public DoubleLinkedList(String data) {
        this.head = new Node(data);
        this.tail = this.head;
    }

    // methods
    public Integer countDoubleLinkedList() {
        Integer count = 0;
        Node curr = this.head;
        while(curr != null) {
            curr = curr.getNext();
            count++;
        }
        return count;
    }

    public void insertFirst(String data) {
        if(this.head == null) {
            System.out.println("Double Linked List is not created yet!");
        } else {
            Node newNode = new Node(data);
            newNode.setNext(this.head);
            this.head.setPrev(newNode);
            this.head = newNode;
        }
    }

    public void insertLast(String data) {
        if(this.head == null) {
            System.out.println("Double Linked List is not created yet!");
        } else {
            Node newNode = new Node(data);
            newNode.setPrev(this.tail);
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public void insertIn(String data, Integer position) {
        if(this.head == null) {
            System.out.println("Double Linked List is not created yet");
        } else {
            if(position < 1 || position > countDoubleLinkedList()) {
                System.out.println("Position is out of range");
            } else if(position == 1) {
                insertFirst(data);
            } else {
                Node newNode = new Node(data);
                Node curr = this.head;
                Integer counter = 1;
                while(counter < position-1) {
                    curr = curr.getNext();
                    counter++;
                }
                Node afterNode = curr.getNext();
                newNode.setPrev(curr);
                newNode.setNext(afterNode);
                afterNode.setPrev(newNode);
                curr.setNext(newNode);
            }
        }
    }

    public void deleteFirst() {
        if(this.head == null) {
            System.out.println("Double Linked List is not created yet!");
        } else {
            Node del = this.head;
            this.head = del.getNext();
            this.head.setPrev(null);
            del = null;
        }
    }

    public void deleteLast() {
        if(this.head == null) {
            System.out.println("Double Linked List is not created yet!");
        } else {
            Node del = this.tail;
            this.tail = del.getPrev();
            this.tail.setNext(null);
            del = null;
        }
    }

    public void deleteIn(Integer position) {
        if(this.head == null) {
            System.out.println("Double Linked List is not created yet");
        } else {
            if(position < 1 || position > countDoubleLinkedList()) {
                System.out.println("Position is out of range");
            } else if(position == 1) {
                deleteFirst();
            } else if(position == countDoubleLinkedList()) {
                deleteLast();
            } else {
                Node curr = this.head;
                Integer counter = 1;
                while(counter < position - 1) {
                    curr = curr.getNext();
                    counter++;
                }
                Node del = curr.getNext();
                Node afterNode = del.getNext();
                curr.setNext(afterNode);
                afterNode.setPrev(curr);
                del = null;
            }
        }
    }

    public void display() {
        if(this.head == null) {
            System.out.println("Double Linked List is not created yet!");
        } else {
            Node curr = this.head;
            while(curr != null) {
                System.out.println(curr.getData());
                curr = curr.getNext();
            }
        }
        System.out.println("Jumlah Data : " + countDoubleLinkedList());
    }

    // encapsulations
    public void setHead(Node node) { this.head = node; }
    public void setTail(Node node) { this.tail = node; }

    public Node getHead() { return this.head; }
    public Node getTail() { return this.tail; }

}
