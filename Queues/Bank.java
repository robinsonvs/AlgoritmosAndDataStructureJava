
public class Bank {

    public static void main(String args[]) {

        int element;
        Queue queue = new Queue();

        queue.enqueue(176);
        queue.enqueue(914);
        queue.enqueue(12);
        queue.enqueue(1817);
        queue.enqueue(100);

        System.out.println("Queue result :");

        while (!queue.isEmpty()) {
            element = queue.dequeue();
            System.out.println("Value : " + element);
        }

    }
}