package homework.homeworkfour;

public class DequeueListElement {

    private DequeueListElement next;
    private DequeueListElement previous;

    private int value;

    public DequeueListElement(int value) {
        this.value = value;
    }

    public DequeueListElement getNext() {
        return next;
    }

    public void setNext(DequeueListElement next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public DequeueListElement getPrevious() {
        return previous;
    }

    public void setPrevious(DequeueListElement previous) {
        this.previous = previous;
    }
}
