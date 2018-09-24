
public class Queue {

    private int[] values;
    private int begin;
    private int end;
    private int total;

    public Queue() {
        this.value = new int[10];
        this.begin = 0;
        this.end = 0;
        this.total = 0;
    }

    public void enqueue(int element) {
        
    }

    public int dequeue() {

    }

    public boolean isEmpty() {
        return (total == 0);
    }

    public boolean isFull() {
        return (total == 10)
    }

}