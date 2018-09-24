
public class Queue {

    private int[] values;
    private int begin;
    private int end;
    private int total;

    public Queue() {
        this.values = new int[10];
        this.begin = 0;
        this.end = 0;
        this.total = 0;
    }

    public void enqueue(int element) {
        values[end] = element;
        end = (end + 1) % values.length;
        total++;
    }

    public int dequeue() {
        int element = values[begin];
        begin = (begin + 1) % values.length;
        total--;
        return element;
    }

    public boolean isEmpty() {
        return (total == 0);
    }

    public boolean isFull() {
        return (total == values.length);
    }

}