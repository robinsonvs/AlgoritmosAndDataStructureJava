
public class Stack {

    private int values[];
    private int top;

    public Stack(){
        this.values = new int[10];
        this.top = -1;
    }

    public void push(int element) {
        this.top++;
        this.values[top] = element;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == values.length);
    }

    public int pop() {
        int element = values[top];
        top--;
        return element;
    }   
}