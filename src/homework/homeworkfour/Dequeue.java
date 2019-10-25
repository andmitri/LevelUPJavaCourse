package homework.homeworkfour;

//Реализовать двунаправленную очередь (дэк) на основе связного списка.
// На основе списка означает, что элементы очереди раскиданы по памяти (а не лежат в одном блоке).
// Внутри не надо использовать OneLinkedList, нужно только по принципу списка сделать.

public class Dequeue {

    private DequeueListElement head;
    private DequeueListElement tail;

    public void addLast(int value){
        DequeueListElement element = new DequeueListElement(value);
        if (head == null) {
            head = element;
            tail = element;
        } else {
//            DequeueListElement current = head;
//            while (current.getNext() != null) {
//                current = current.getNext();
//            }
//            current.setNext(element);
//            element.setPrevious(current);
//            tail = element;
            tail.setNext(element);
            element.setPrevious(tail);
            tail = element;
        }
    }

    public boolean delete(int index) {
        if (index == 0) {
            head = head.getNext();
            if (head != null){
                head.setPrevious(null);
            } else{
                tail = null;
            }
            return true;
        }
        DequeueListElement elementBefore  = head;
        for (int i = 1; i == index - 1; i++) {
            elementBefore = elementBefore.getNext();
            if (elementBefore == null) {
                return false;
            }
        }
        if (elementBefore.getNext() == null) {
            return false;

        }
        DequeueListElement elementAfter = elementBefore.getNext().getNext();
        if (elementAfter == null) {
            elementBefore.setNext(null);
            tail = elementBefore;
            return  true;
        }
        elementBefore.setNext(elementAfter);
        elementAfter.setPrevious(elementBefore);
        return true;
    }

}
