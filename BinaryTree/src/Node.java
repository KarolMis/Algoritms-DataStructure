public class Node <T> {
    private T date;
    private Node<T> leftChild;
    private Node<T> rightChild;

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

    public Node<T> getLeftChild() {
        return leftChild;
    }

    public Node<T> setLeftChild(Node<T> leftChild) {
        this.leftChild = leftChild;
        return this;
    }

    public Node<T> getRightChild() {
        return rightChild;
    }

    public Node<T> setRightChild(Node<T> rightChild) {
        this.rightChild = rightChild;
        return this;
    }

    @Override
    public String toString() {
        return this.date.toString();
    }
}