public class Main {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new Queue<>();

        myQueue.enqueue(10);

        System.out.println(myQueue.isEmpty());
        System.out.println(myQueue.size());

        myQueue.enqueue(1000);

        System.out.println(myQueue.size());

        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());

    }
}
