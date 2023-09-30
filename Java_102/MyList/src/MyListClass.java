import java.util.ArrayList;

public class MyListClass <T>{
    private int capacity;
    private T[] array;
    private  int index = 0;

    public MyListClass() {
        this.capacity = 10; // Varsayılan kapasite 10.
        this.array = (T[]) new Object[capacity];
    }
    public MyListClass(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
        for (T i :array){
            System.out.println(i);
        }
    }

    public void add(T data){
        if (array.length > getCapacity()){
            setCapacity(getCapacity()*2);
        }
        array[index] = data;
        index++;
    }

    public int size(){
        return array.length;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        T[] newArray =(T[]) new Object[capacity];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
        this.capacity = capacity;
    }



}
