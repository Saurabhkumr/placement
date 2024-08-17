package CustomStack;

import java.util.Queue;

public class Main {
    public static void main(String[] args) {
          CustomStack s = new CustomStack(5);

          s.push(12);
          s.push(121);
          s.push(122);
          s.push(123);
          s.push(124);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
