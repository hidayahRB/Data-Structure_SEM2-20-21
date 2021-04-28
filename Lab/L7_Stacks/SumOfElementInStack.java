//Q3
//Assuming that an unknown number of positive integers are stored in a stack, S.
//Using only stack ADT operations write an algorithm/function to find the sum of
//every element in S.
package stack;

public class SumOfElementInStack {
    
    public static void main(String[] args) {
        Stack<Integer> S = new Stack<>();
        for (int i = 0; i < 5; i++) {
            S.push((int)(Math.random() * 10 + 1));
        }
        System.out.println(S);
        // sum all element in Stack
        int sum = 0;
        while (!S.isEmpty()) {
            sum += S.pop();
        }
        System.out.println("Final sum value: "+sum);
    }
    
}
