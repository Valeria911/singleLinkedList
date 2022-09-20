package project;

//create class that has operations create new, get first node, add node at the end, print
public class SinglyLinkedList {

    //create class node
    class Node {
        //atributes data and next
        int data;
        Node next;

        //constructor with data
        public Node(int data){
            this.data = data;
            this.next = null; //first next is null because where creating the first node
        }

        //setter method for next
        public void setNext(Node next) {
            this.next = next;
        }
    }//end of node class and specifications


    //create head and tail of the singly linked list
    public Node head = null;
    public Node tail = null;

    //method for adding a new node to the singly linked list
    public void addNode(int data){
        Node newNode = new Node(data);

        //for a start, verify if the node exists, if not, create head and tail in the same position
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            //if there is a first node, then the new node is added to the list
            tail.next = newNode;
            //this new node is the new tail of the singly linked list
            tail = newNode;
        }
    }

    //method for printing the full singly list
    public  void displayList(){
        //first name a new node that points to head
        Node current = head;

        //verify not null
        if (head == null) {
            System.out.println("Singly linked list is empty");
        } else {
            System.out.println("This is the singly linked list: ");
            while ( current != null) {
                //print the list by showing each node and increment the pointer with .next
                System.out.println(current.data + " ");
                current = current.next;
            }
            System.out.println(" ");
        }
    }

}
