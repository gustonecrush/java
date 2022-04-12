package id.college;

public class Node {

    // properties
    private String data;
    private Node next;

    // constructor
    Node(String data) {
        this.data = data;
        this.next = null;
    }

    Node() {
        this.data = "";
        this.next = null;
    }

    // methods

    // encapsulations
    public void setData(String newData) { this.data = newData; }
    public void setNext(Node next) { this.next = next; }

    public String getData() { return this.data; }
    public Node getNext() { return this.next; }

}
