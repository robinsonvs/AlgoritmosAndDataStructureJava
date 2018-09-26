
public class SimpleLinkedList {

    private Node node;

    public SimpleLinkedList() {
        this.node = null;
    }

    public void add(int element) {
        Node newNode = new Node();
        newNode.setElement(element);
        newNode.setNext(null);

        if (node == null) {
            node = newNode;
        } else {
            Node nodeAux = node;
            while (nodeAux.getNext() != null) {
                nodeAux = nodeAux.getNext();
            }
            nodeAux.setNext(newNode);
        }
    }

    public int remove() {
        if (node != null) {
            Node nodeAux = node;
            int element = nodeAux.getElement();
            node = nodeAux.getNext();
            return element;
        } else {
            throw new RuntimeException("Empty list ...");
        }

    }

    public void list() {
        if (node == null) {
            System.out.println("Empty list ...");
        } else {
            Node nodeAux = node;
            while (nodeAux != null) {
                System.out.println("Element : " + nodeAux.getElement());
                nodeAux = nodeAux.getNext();
            }
        }
    }

    public boolean isEmpty() {
        return this.node == null;
    }
}