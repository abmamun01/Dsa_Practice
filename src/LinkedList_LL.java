public class LinkedList_LL {


    Node head;
    private int size;


    //for size constructor
    LinkedList_LL() {
        this.size = 0;
    }

    //akta Node class banabo
    //Node r modde amra "Data & Next pointer" store korar jonno class r form ye likhi
    class Node {


        //Storing data and next
        String data;
        // Next mane hocce samner ba arekta Node r Next
        Node next;

        //Constructor making
        Node(String data) {
            this.data = data;
            //Jokhon e new Node banate jabo tar next Node always null hobe suru te
            //  karon suru te single node create hobe kono list create hobena
            this.next = null;

            //new node create korchi tai
            size++;
        }

    }

    //to add element at first
    public void addFirst(String data) {

        Node newNode = new Node(data);
        //Checking kono linked list ki exist kina ba head null kina
        if (head == null) {
            head = newNode;
            return;
        }


        /**
         *  That's mean tmi jodi Existing lister
         *  surute add korte caw tahole "new Node" r j next position ache seta head r dike & tokhon
         *   head new node hoye jabe
         */
        //NewNode r next pointer define
        newNode.next = head;
        //changing head position
        head = newNode;


    }


    //addLast
    public void addLast(String data) {

        /**
         * amader linkedList r head theke suru kore prottekta element traverse korte thakbo
         * jotokhon porjonto last element orthat null pointer pawa na jay
         *
         * tarpor jokhon last element jabo tokhon :jehetu last null ye point korchilo: last
         * element k new node ye r sathe link korbo
         */

        Node newNode = new Node(data);
        //Checking kono linked list ki exist kina ba head null kina
        if (head == null) {
            head = newNode;
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        //while loop theke beriye akhane asbe r tokhon last element r point
        // newNode r dike dibo r newNode to null point korbe
        currentNode.next = newNode;

    }


    //Pring
    public void printList() {

        if (head == null) {
            System.out.println("List is Empty!");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }


    //delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("This is empty list");
            return;
        }
        //Jehetu first element delete korbo r first ele e jehetu amdr head tai
        // head pointer 1 idx theke 2 idx ye shift kore dibo tahole e delete hoye jabe
        head = head.next;

        //delete korchi
        size--;
    }

    //delete Last
    // for explain : 36.50 time
    public void deleteLast() {
        if (head == null) {
            System.out.println("This is empty list");
            return;
        }

        size--;

        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {

        /**
         * 1.Insert Operation
         * 2.print Operation
         * 3.delete Operation
         * 4.size check Operation
         */


        // add -first,last

        LinkedList_LL list = new LinkedList_LL();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");

        list.printList();


        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();


        System.out.println(list.getSize());


        list.addFirst("New add");

        System.out.println(list.size);


    }

}
