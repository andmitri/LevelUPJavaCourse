package lessonsix;

public class App {

    public static void main(String[] args) {
        ListBasedOnArray list = new ListBasedOnArray(5);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.addLast(9);
        list.addLast(8);

        OneLinkedList linkedList = new OneLinkedList();
        linkedList.addLast(10);
        linkedList.addLast(10);
        linkedList.addLast(10);
        linkedList.addLast(10);
        linkedList.addLast(10);
        linkedList.addLast(10);
        linkedList.addLast(10);
    }

}
