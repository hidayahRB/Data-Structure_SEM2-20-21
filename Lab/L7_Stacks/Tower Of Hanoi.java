//Q5
//The Tower of Hanoi is a mathematical game or puzzle. It consists of three rods, and
//a number of disks of different sizes which can slide onto any rod. The puzzle starts
//with the disks in a neat stack in ascending order of size on one rod, the smallest at
//the top, thus making a conical shape. The objective of the puzzle is to move the
//entire stack to another rod, obeying the following rules:
//i) Only one disk may be moved at a time.
//ii) Each move consists of taking the upper disk from one of the rods and sliding it
//onto another rod, on top of the other disks that may already be present on that rod.
//iii) No disk may be placed on top of a smaller disk.
//You are required to write the source code

package stack;
import java.util.Scanner;
import java.util.Stack;
public class TowerOfHanoi {

    public static int N;
    /* Creating Stack array */
    public static Stack<Integer>[] tower = new Stack[4];
    
    /* Function to push disks into stack */
    public static void tower(int n) {
        for (int d = n; d > 0; d--) {
            tower[1].push(d);
        }
        display();
        move(n, 1, 2, 3);
    }

    public static void display() {
        System.out.println(" A | B | C");
        System.out.println("‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐");
        for (int i = N - 1; i >= 0; i--) {
            String d1 = " ", d2 = " ", d3 = " ";
            try {
                d1 = String.valueOf(tower[1].get(i));
            } catch (Exception e) {
            }
            try {
                d2 = String.valueOf(tower[2].get(i));
            } catch (Exception e) {
            }
            try {
                d3 = String.valueOf(tower[3].get(i));
            } catch (Exception e) {
            }
            System.out.println(" " + d1 + " | " + d2 + " | " + d3);
        }
        System.out.println("\n");
    }
   
    public static void move(int n, int a, int b, int c) {
        //basecase n = 0
        if (n > 0) {
            //first case
            move(n - 1, a, c, b);
            //second case
            int d = tower[a].pop();
            tower[c].push(d);
            display();
            //third case
            move(n - 1, b, a, c);
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // array of object
        tower[1] = new Stack<Integer>();
        tower[2] = new Stack<Integer>();
        tower[3] = new Stack<Integer>();
        
        // Accept number of disk
        System.out.print("Enter number of disk: ");
        int num = scan.nextInt();
        N = num;
        tower(num);
    }
    
}
