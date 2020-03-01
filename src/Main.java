class CustomLinkedList {

    Node head;
    int counter;

    public void add(int nextValue) {
        if(head == null)
            head = new Node(nextValue);

        Node temp = new Node(nextValue);
        Node current = head;

        if(current != null) {
            while(current.getNext() != null)
                current = current.getNext();
            current.setNext(temp);
        }
        incrementCounter();
    }

    public void remove(int index) {
        if(head != null && index >= 0 && index < getCounter()) {
            Node node = head;
            for(int i=0; i<index; i++)
                node = node.getNext();
            node.setNext(node.getNext().getNext());
            decrementCounter();
        }
    }

    public Node getNode(int index) {
        if(index < 0)
            return null;

        if(head != null) {
            Node node = head;
            node = node.getNext();
            for(int i=0; i<index; i++) {
                node = node.getNext();
            }
            return node;
        }
        return null;
    }

    private void incrementCounter() {
        counter++;
    }

    private void decrementCounter() {
        counter--;
    }

    public int getCounter() {
        return counter;
    }

    class Node {

        int value;
        private Node next;

        public Node(int nextValue) {
            value = nextValue;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node nextNode) {
            next = nextNode;
        }
    }
}


public class Main {

    public static void main(String[] args) {
        CustomLinkedList list1 = new CustomLinkedList();

    }
}

