package stack;

import java.util.Scanner;

public class TestIntMyStack {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
        // a) Prompt user to enter an integer value.
        MyStack<Integer> s1 = new MyStack<>();
        System.out.print("Please enter an integer: ");
        int value = input.nextInt();
        
        // b) Push the values 1 through the user entered value onto the stack.
        for (int i = 1; i <= value; i++) {
            s1.push(i);
        }
        
        // c) Print the size of the stack.
        System.out.println(s1);
        System.out.println("Size of stack:"+s1.getSize());
        
        // d) Display the contents of the stack by repeatedly calling pop() until the stack is empty.
        System.out.print("Popping the stack: ");
        while (!s1.isEmpty()) {
            int intValue = s1.pop();
            System.out.print(intValue + " ");
        }
        System.out.print("\n");
    }
    
}
