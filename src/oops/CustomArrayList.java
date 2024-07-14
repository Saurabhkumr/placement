package oops;

import java.util.Arrays;

public class CustomArrayList {

    private int[] arr;
    private int DefaultSize = 10;
    private int size=0;

    public CustomArrayList(){
        this.arr=new int[DefaultSize];
    }
    public void add(int n){
        if(isFull()){
            recreate();
        }
        arr[size++]=n;
    }

    private void recreate() {
        int[] temp = new int[DefaultSize*2];
        for(int i = 0 ; i<DefaultSize;i++){
            temp[i]=arr[i];
        }
        arr=temp;
        DefaultSize=DefaultSize*2;
    }

    private boolean isFull() {
        return size == DefaultSize;
    }


    public int remove(){
        return arr[--size];
    }
    @Override
    public String toString(){
        return "Custom ArrayList is : "+ Arrays.toString(arr);
    }

    public static void main(String[] args) {
        CustomArrayList cl = new CustomArrayList();
        for (int i = 0; i < 12; i++) {
            cl.add(i*2);
        }
        System.out.println(cl.size);
        System.out.println(cl.remove());
        cl.add(100);
        System.out.println(cl);
    }
}
