import java.util.ArrayList;

public class MyListClass <T>{
    private int capacity;

    private int elementCount;
    private T[] array;
    private int index;

    public MyListClass() {
        this.capacity = 10; // Varsayılan kapasite 10.
        this.array = (T[]) new Object[capacity];
        this.elementCount = 0;
        this.index = 0;
    }
    public MyListClass(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
        this.elementCount = 0;
        this.index = 0;

        for (T i :array){
            System.out.println(i);
        }
    }

    public void add(T data){ //Diziye eleman ekler.
        if (this.elementCount == getCapacity()){
            setCapacity(getCapacity()*2);
        }
        try{
            if (this.array[index -1] == null){
                this.array[index - 1] = data;
            }else{
                this.array[index] = data;
            }
        }catch (Exception e){
            this.array[index] = data;
        }
        setElementCount(this.getElementCount()+1);
        this.index++;
    }

    public T get(int index){//girilen indexteki değeri getirir.
        try {
            return this.array[index];
        }catch (Exception e) {
            return null;
        }
    }

    public void remove(int index){//girilen indexteki değeri siler.
        try{
        for (int i = index; i < this.getElementCount() - 1; i++){
            this.array[i] = this.array[i + 1];
        }
        this.array[this.getElementCount() -1] = null;

        }catch (Exception e){

        }
    }
    public void set(int index ,T data){//Girilen indexdeki değeri verilen datayı atar.
        try{
            this.array[index] = data;
        }catch (Exception e){

        }
    }

    public String toString() {
        String arrayString = "";
        int i = 0;
        while (i < this.elementCount){
            arrayString += this.array[i] + " ";
            i++;
        }
        return arrayString;
    }


    public int getElementCount() {
        return elementCount;
    }

    public void setElementCount(int elementCount) {
        this.elementCount = elementCount;
    }


    public int size(){  //Dizinin eleman sayısını verir.
        return getElementCount();
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
