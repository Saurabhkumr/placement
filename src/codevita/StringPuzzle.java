package codevita;

import java.util.*;

public class StringPuzzle {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> tree = new HashMap<>();
        Set<String> allnodes = new HashSet<>();
        Set<String> child = new HashSet<>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i =0 ; i<n ; i++){
            String[] node = sc.nextLine().split(" ");
            if(node.length<2){
                System.out.println("String must be in pairs");
                return;
            }
            if(!tree.containsKey(node[0])){
                tree.put(node[0],new ArrayList<>());
            }
            tree.get(node[0]).add(node[1]);
            allnodes.add(node[0]);
            allnodes.add(node[1]);
            child.add(node[1]);
        }

        String root=null;
        for(String str : allnodes){
            if(!child.contains(str)){
                root=str;
                break;
            }
        }

        HashMap<String,Integer> level = new HashMap<>();
        level.put(root,1);
        Queue<String> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            String head = queue.poll();
            int cl = level.get(head);
            if(tree.containsKey(head)){
                for(String str : tree.get(head)){
                    if(!level.containsKey(str)){
                        level.put(str,cl+1);
                        queue.add(str);
                    }
                }
            }
        }

        String[] words = sc.nextLine().split(" ");
        int totallevel=0;
        for (String str : words){
            totallevel+=level.get(str);
        }

        System.out.println(totallevel);

    }
}
