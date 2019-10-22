package homework.homeworkfour;
//Реализовать очередь на основе массива. Очередь имеет ограниченный размер - если кто-то пытается добавить объект в очередь, которая заполнена, то тогда ничего не происходит.
// Сделать так, что метод добавления в очередь возвращает boolean: true, если элемент добавлен, false - если нет.

public class QueryBasedOnArray {

    private int[] elementData;
    private int size;

    public QueryBasedOnArray() {
        this.elementData = new int[100];
    }

    public QueryBasedOnArray(int Capacity) {
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



    }

}
