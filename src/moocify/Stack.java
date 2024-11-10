package moocify;

import java.util.ArrayList;

public class Stack {
    ArrayList<String> item;
    public Stack(){
        this.item=new ArrayList<>();
    }
    public boolean isEmpty(){
        return item.isEmpty();

    }
    public void add(String value){
      item.add(value);
    }
    public ArrayList<String> values(){
        return new ArrayList<>(this.item);
    }
    public String take(){
        String top= item.get(item.size()-1);
        item.remove(item.size()-1);
        return top;
    }
}
