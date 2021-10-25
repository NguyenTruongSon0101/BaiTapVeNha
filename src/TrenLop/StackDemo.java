package TrenLop;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack;
        stack = new Stack<>();
        stack.push("Xin");
        stack.push("chào");
        stack.push("mọi người");

        System.out.println(stack);

        String poped = stack.pop();

        System.out.println("Phần tử đã lấy: "+poped);

        System.out.println("phần tử còn lại trong stack: "+stack);

        //Thăm phần tử đỉnh của stack
        String phanTuDinh = stack.peek();
        System.out.println("phần tử trên đỉnh Stack: "+phanTuDinh);
        System.out.println("phần tử còn lại trong stack: "+stack);
    }
}
