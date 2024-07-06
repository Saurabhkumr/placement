import java.util.ArrayList;
import java.util.Arrays;

public class Maze {
    public static void main(String[] args) {
//        mazePath("",3,3);
//        System.out.println(mazePathArray("",3,3));
        Boolean[][] maze={
                {true, true,true},
                {true, true,true},
                {true, true,true}
        };
//        mazeAllDirection(maze,0,0,"");
        int[][] matrix= new int[maze.length][maze[0].length];
        mazeAllDirectionMatrix(maze,0,0,"", matrix ,1);
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

    static void mazeAllDirection(Boolean[][] maze , int r , int c,String p){

        if(r== maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }

        maze[r][c]=false;

        if(r < maze.length-1) mazeAllDirection(maze,r+1,c,p+"D");
        if(c < maze[0].length-1)mazeAllDirection(maze,r,c+1,p+"R");
        if(r>0) mazeAllDirection(maze,r-1,c,p+"U");
        if(c>0) mazeAllDirection(maze,r,c-1,p+"L");

        maze[r][c]=true;

    }

    static void mazeAllDirectionMatrix(Boolean[][] maze , int r , int c,String p, int[][] matrix , int step){

        if(r== maze.length-1 && c==maze[0].length-1){
            matrix[r][c]=step;
            for (int[] arr : matrix){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c]){
            return;
        }

        maze[r][c]=false;
        matrix[r][c]=step;
        if(r < maze.length-1) mazeAllDirectionMatrix(maze,r+1,c,p+"D",matrix,step+1);
        if(c < maze[0].length-1)mazeAllDirectionMatrix(maze,r,c+1,p+"R",matrix,step+1);
        if(r>0) mazeAllDirectionMatrix(maze,r-1,c,p+"U",matrix,step+1);
        if(c>0) mazeAllDirectionMatrix(maze,r,c-1,p+"L",matrix,step+1);

        maze[r][c]=true;
        matrix[r][c]=0;

    }




}
