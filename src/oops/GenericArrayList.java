package oops;

import java.util.Arrays;

public class GenericArrayList<T> {

    private Object[] arr;
    private int DefaultSize = 10;
    private int size=0;

    public GenericArrayList(){
        this.arr=new Object[DefaultSize];
    }
    public void add(T n){
        if(isFull()){
            recreate();
        }
        arr[size++]=n;
    }

    private void recreate() {
        Object[] temp = new Object[DefaultSize*2];
        for(int i = 0 ; i<DefaultSize;i++){
            temp[i]=arr[i];
        }
        arr=temp;
        DefaultSize=DefaultSize*2;
    }

    private boolean isFull() {
        return size == DefaultSize;
    }


    public T remove(){
        T removed = (T)(arr[--size]);
        return (T)removed;
    }
    @Override
    public String toString(){
        return "Custom ArrayList is : "+ Arrays.toString(arr);
    }

    public static void main(String[] args) {
        GenericArrayList<String> cl = new GenericArrayList();
        for (int i = 0; i < 12; i++) {
            cl.add("a"+i);
        }
        System.out.println(cl.size);
        System.out.println(cl.remove());
        cl.add(100+"");
        System.out.println(cl);
    }
}
