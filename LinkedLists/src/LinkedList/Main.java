package LinkedList;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();

        list.insert(10);
        list.insert(11);
        list.insert(12);
        list.insert(13);
        list.insert(14);
        list.insert(15);
        list.insert(16);
        list.insert(17);
        list.insert(18);
        list.insert(19);
        list.insert(20);
        list.insert(21);

        list.remove(14);
        System.out.println(list.size());

        list.traverseList();

    }
}
