package Tree;

public class Trie {
    static  class  Node{
        Node[] children;
        boolean eow;

       public Node(){
            children = new Node[26];
            for(int i=0;i<26;i++) {
                children[i] = null;
            }
        }
    }

    static Node root = new Node();

 public static void insert(String str ){
     Node curr=root;
     for(int i = 0 ; i<str.length() ;i++){
         int idx = str.charAt(i)-'a';
         if(curr.children[idx]==null){
             curr.children[idx]=new Node();
         }
         curr=curr.children[idx];
     }
     curr.eow=true;
 }

 public static boolean search(String str){
     Node curr = root;
     for (int i = 0; i < str.length(); i++) {
         int idx = str.charAt(i)-'a';
         if(curr.children[idx]==null)return false;
         curr=curr.children[idx];
     }
     return curr.eow;
 }

    public static void main(String[] args) {
         String[] str = {"the" , "there" ,"any","cat","another","their"};
         for(String s : str)insert(s);
        System.out.println(search("there"));
        System.out.println(search("that"));
        System.out.println(search("any"));
    }
}
