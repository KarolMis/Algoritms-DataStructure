public class BinarySearchTree<T extends Comparable> implements Tree<T> {

    private Node<T> root;

    @Override
    public void insert(T data) {

        if(root == null){
            root = new Node<>(data);
        }
        else insertNode(data, root);
    }

    @Override
    public void traversal() {
        if (root != null){
            inOrderTraversal(root);
        }
    }

    private void inOrderTraversal(Node<T> node) {

        if(node.getLeftChild() != null){
            inOrderTraversal(node.getLeftChild());
        }

        System.out.print(node + " ---> ");

        if(node.getRightChild() != null) {
            inOrderTraversal(node.getRightChild());
        }
    }


    private void insertNode(T newData, Node<T> node) {

        if (newData.compareTo(node.getDate()) < 0){
            if (node.getLeftChild() != null){
                insertNode(newData, node.getLeftChild());
            } else {
                Node<T> newNode = new Node<>(newData);
                node.setLeftChild(newNode);
            }
        } else {
            if (node.getRightChild() != null){
                insertNode(newData, node.getRightChild());
            } else {
                Node<T> newNode = new Node<>(newData);
                node.setRightChild(newNode);
            }
        }

    }


    private Node<T> delete(Node<T> node, T data) {

        if(node == null){
            return node;
        }

        if(data.compareTo(node.getDate()) < 0) {
            node.setLeftChild(delete(node.getLeftChild(), data));
        } else if (data.compareTo(node.getDate()) > 0) {
            node.setRightChild(delete(node.getRightChild(), data));
        } else {

            if(node.getLeftChild() == null && node.getRightChild() == null){
                System.out.println("Removing a leaf node.. ");
                return null;
            }

            if(node.getLeftChild() == null){
                System.out.println("Removing a right node.. ");
                Node<T> tempNode = node.getRightChild();
                node = null;
                return tempNode;
            } else if(node.getRightChild() == null){
                System.out.println("Removing a left node.. ");
                Node<T> tempNode = node.getLeftChild();
                node = null;
                return tempNode;
            }

            Node<T> tempNode = getPredecessor(node.getLeftChild());
            node.setDate(tempNode.getDate());
            node.setLeftChild(delete(node.getLeftChild(), tempNode.getDate()));
        }


        return node;
    }

    private Node<T> getPredecessor(Node<T> node) {

        if(node.getRightChild() != null){
            return getPredecessor(node.getRightChild());
        } return node;
    }

    @Override
    public void delete(T data) {

        if (root != null)
            root = delete(root, data);
    }

    @Override
    public T getMaxValue(){
        if(root == null) return null;

        return getMax(root);
    }


    private T getMax(Node<T> node) {
        if (node.getRightChild() != null){
            return getMax(node.getRightChild());
        }
        return node.getDate();
    }
    @Override
    public T getMinValue(){
        if(root == null) return null;

        return getMin(root);
    }



    private T getMin(Node<T> node) {
        if (node.getLeftChild() != null){
            return getMin(node.getLeftChild());
        }
        return node.getDate();
    }


}
