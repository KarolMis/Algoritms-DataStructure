public class Node <T extends Comparable> {
    private T date;
    private Node<T> nextNode;

    public Node(T date) {
        this.date = date;
    }

    public T getDate() {
        return date;
    }

    public Node<T> setDate(T date) {
        this.date = date;
        return this;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public Node<T> setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
        return this;
    }

    @Override
    public String toString() {
        return this.date.toString();
    }
}
