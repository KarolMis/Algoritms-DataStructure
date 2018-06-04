package LinkedList;

public class LinkedList<T extends Comparable<T>> implements List<T> {

    private Node<T> root;
    private int sizeOfTheList;

    @Override
    public void insert(T data) {
        ++this.sizeOfTheList;

        if(root == null){
            this.root = new Node<>(data);
        } else insertDateAtBeginning(data);
    }

    private void insertDateAtBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(root);
        this.root = newNode;
    }

    @Override
    public void remove(T data) {

        if(this.root == null) return;

        --this.sizeOfTheList;

        if(this.root.getDate().compareTo(data) == 0){
            this.root = this.root.getNextNode();
        } else {
            remove(data, root, root.getNextNode());
        }
    }

    private void remove(T dataToRemove,  Node<T> previousNode, Node<T> actualNode) {

        while (actualNode != null){

            if (actualNode.getDate().compareTo(dataToRemove) == 0){
                previousNode.setNextNode(actualNode.getNextNode());
                actualNode = null;
                return;
            }

            previousNode = actualNode;
            actualNode = actualNode.getNextNode();

        }

    }

    @Override
    public void traverseList() {
        if(this.root == null) return;

        Node<T> actualNode = this.root;

        while (actualNode != null){
            System.out.print(actualNode + " - ");
            actualNode = actualNode.getNextNode();
        }

    }

    @Override
    public int size() {
        return this.sizeOfTheList;
    }
}
