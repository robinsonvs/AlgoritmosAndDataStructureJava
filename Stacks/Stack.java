
public class Stack {

    private int values[];
    private int top;

    public Stack(){
        this.values = new int[10];
        this.top = -1;
    }

    public void push(int element) {
        this.top = top++;
        this.values[top] = element;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == 9);
    }

    public int pop() {
        int elem = values[top];
        top--;
        return elem;
    }   
}