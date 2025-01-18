package daa;

import java.util.Arrays;
import java.util.Comparator;

class Item{
    int value,weight;
    public Item(int v , int w){
        this.value=v;
        this.weight=w;
    }
}
class itemComparator implements Comparator<Item> {
    public int compare(Item a , Item b){
        double r1 = (double) a.value/(double) a.weight;
        double r2 = (double) b.value/(double) b.weight;
        if(r1<r2)return 1;
        else if(r1>r2)return -1;
        else return 0;
    }
}
public class Fractionalknapsack {
    public static void main(String[] args) {
        Item[] items = {new Item(60, 10), new Item(100, 20), new Item(120, 30)};
        int w = 40;
        System.out.println(solution(w,items));
    }
    public static double solution(int w , Item[] items){
        Arrays.sort(items,new itemComparator() );
        double result=0.0;
        for(Item i : items){
            if(i.weight<=w){
                result+=i.value;
                w-=i.weight;
            }
            else {
                 result+=(double) i.value*w/(double) i.weight;
            }


        }
        return result;
    }

}
