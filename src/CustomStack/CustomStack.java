package CustomStack;

public class CustomStack {
    final private int[] stack;
    private int top=-1;
    CustomStack(int n){
        this.stack=new int[n];
    }
    public void push(int n) {
        if(top== stack.length) {
            System.out.println("stack is full");
        }
        top++;
        stack[top]=n;
    }
    public int pop() {
        if(top==-1) {
            System.out.println("stack is empty");;
        }
        int remove=stack[top];
        top--;
        return remove;
    }
}