import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        mazePath("",3,3);
        System.out.println(mazePathArray("",3,3));
    }
    static void mazePath(String p , int r , int c){
        if(r==1 && c==1){
            System.out.println(p);

        }

        if(r>1)mazePath(p+"D",r-1,c);
        if(c>1)mazePath(p+"R",r,c-1);
    }
    static ArrayList<String> mazePathArray(String p , int r , int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }

        ArrayList<String> ans = new ArrayList<>();

        if(r>1)
            ans.addAll(mazePathArray(p+"D",r-1,c));
        if(c>1)
            ans.addAll(mazePathArray(p+"R",r,c-1));


        return ans;
    }

}
