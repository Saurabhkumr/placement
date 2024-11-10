package moocify;

import java.util.ArrayList;

public class Menu {
    ArrayList<String> meal;
    public Menu(){
        meal= new ArrayList<>();
    }
    public void addMeal(String m){
        this.meal.add(m);
    }
    public void printMeals(){
        for (int i = 0; i < meal.size(); i++) {
            System.out.println(meal.get(i));
        }
    }
    public void clearMenu(){
        meal.clear();
    }




}
