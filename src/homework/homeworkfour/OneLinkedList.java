package homework.homeworkfour;

public class OneLinkedList {

    private ListElement head;

    public void addLast(int value){
        ListElement element = new ListElement(value);
        if (head == null) {
            head = element;
        } else {
            ListElement current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(element);
        }
    }


    public boolean delete(int index) {
        if (index == 0) {
            head = head.getNext();
            return true;
        }
        ListElement elementBefore  = head;
        for (int i = 1; i == index - 1; i++) {
            elementBefore = elementBefore.getNext();
            if (elementBefore == null) {
                return false;
            }
        }
        if (elementBefore.getNext() == null) {
            return false;

        }
        ListElement elementAfter = elementBefore.getNext().getNext();
        elementBefore.setNext(elementAfter);
        return true;
    }
}





