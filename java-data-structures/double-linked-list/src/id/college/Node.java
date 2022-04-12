package id.college;

public class Node {

    // properties
    private String data;
    private Node next;
    private Node prev;

    // constructor
    public Node(String data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    // overloading constructor
    public Node() {
        this.data = "";
        this.next = null;
        this.prev = null;
    }

    // encapsulations
    public void setData(String data) { this.data = data; }
    public void setNext(Node node) { this.next = node; }
    public void setPrev(Node node) { this.prev = node; }

    public String getData() { return this.data; }
    public Node getNext() { return this.next; }
    public Node getPrev() { return this.prev; }

}
