
public class SimpleListMain {

    public static void main (String args[]) {

        SimpleLinkedList simpleList = new SimpleLinkedList();

        simpleList.add(872);
        simpleList.add(123);
        simpleList.add(1597);
        simpleList.add(2);

        while (!simpleList.isEmpty()) {
            int element = simpleList.remove();
            System.out.println("Element removed : " + element);
        }

        simpleList.list();

        simpleList.add(872);
        simpleList.add(123);
        simpleList.add(1597);
        simpleList.add(2);

        simpleList.list();                
    }
}