package homework.homeworkfour;
//Реализовать стек на основе массива.
// Стек должен иметь фиксированный размер, логика добавления элемента в заполненный стек такая же как в очереди (п. 2).

public class Stack {

    private int[] elementData;
    private int size;

    public Stack() {
        this.elementData = new int[100];
    }

    public Stack (int Capacity) {
        this.elementData = new int[Capacity];
    }

    public boolean push (int value) {
        if (elementData.length == size) {
            return false;
        } else {
            elementData[size] = value;
            size++;
            return true;
        }

    }

    public int pop () {

        int popValue = elementData[size];
        size--;

        return popValue;
    }

}
