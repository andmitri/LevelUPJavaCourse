package lessonsix;

public class ListBasedOnArray {

    private int[] elementData;
    private int size;

    public ListBasedOnArray() {
        this.elementData = new int[100];
    }

    public ListBasedOnArray(int initialCapacity) {
        this.elementData = new int[initialCapacity];
    }

    public void addLast(int value) {
        if (elementData.length == size) {

            int[] oldArray = elementData;
            elementData = new int[(int) (elementData.length * 1.5)];
            System.arraycopy(oldArray, 0, elementData, 0, oldArray.length);
        }

        elementData[size] = value;
        size++;
    }


    public boolean delete(int index) {
        if(index >= size) return false;
        for (int i = index; i < size-1; i++) {
            elementData[i] = elementData[i+1];
        }
        size--;
        return true;
    }


}
