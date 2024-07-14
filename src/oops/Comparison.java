package oops;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Comparison implements Comparable<Comparison>{

    public String name;
    public int age;

    public Comparison(String n , int a){
        name=n;
        age=a;
    }
    @Override
    public int compareTo(Comparison o) {
        return this.age-o.age;
    }

    // comparing name
//    public int compareTo(Comparison o) {
//        return this.name.compareTo(o.name);
//    }

    public String toString(){
        return "Name : "+this.name+" , Age : "+this.age;
    }


   static class ComparisonComparator implements Comparator<Comparison> {
        @Override
        public int compare(Comparison p1, Comparison p2) {
//            return Integer.compare(p1.age, p2.age);
            return  p1.age-p2.age;
        }
    }

    public static void main(String[] args) {
        ArrayList<Comparison> c = new ArrayList<>();
        c.add(new Comparison("saurabh", 21));
        c.add(new Comparison("anmol", 26));
        c.add(new Comparison("komal", 11));
        c.add(new Comparison("manav", 23));



        // comparable:

//        for (Comparison com : c) {
//            System.out.println(com);
//        }
//
//        Collections.sort(c);
//        System.out.println("After sorting ......");
//        for (Comparison com : c) {
//            System.out.println(com);
//        }
//




        // Comparator :

        // anonymous class

//        Collections.sort(c, new Comparator<Comparison>() {
//            @Override
//            public int compare(Comparison o1, Comparison o2) {
//                return o1.age-o2.age;
//            }
//        });


        // lambda expression:

//        Collections.sort(c,(o1,o2)-> o1.age-o2.age);


        //implementing comparator :

        Collections.sort(c,new ComparisonComparator());

        for (Comparison com : c) {
            System.out.println(com);
        }


    }
}
