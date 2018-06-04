public class Main {
    public static void main(String[] args) {

        Tree<Integer> tree = new BinarySearchTree<>();

        tree.insert(100);
        tree.insert(1000);
        tree.insert(10000);
        tree.insert(10);
        tree.insert(-10);

        System.out.println(tree.getMaxValue());
        System.out.println(tree.getMinValue());


        tree.delete(100);

        tree.traversal();

    }
}
