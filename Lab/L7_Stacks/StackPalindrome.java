//Q4
//A string is a palindrome if it spells the same way forwards and backwards. Write a
//Java program that uses a Stack to determine if a string is a palindrome or not. Let
//your string be of maximum size 15 characters. Note however that the actual size
//may be 15 or less.
package stack;

import java.util.Scanner;

public class StackPalindrome {

    public static void main(String[] args) {
        // Create stack object
        Stack<String> stack = new Stack<>();
        Scanner scan = new Scanner(System.in);
        String input="";
        do {
            System.out.print("Enter characters (Maximum 15 characters): ");
            input = scan.next();
        } while (input.length() == 0 || input.length() > 15);
 
        // split string into array of character
        String[] c = input.split("");
        //Push into stack object
        for(int i=0;i<c.length;i++){
            stack.push(c[i]);
        }
        
        String output = "";
        //Pop all values from the stack
        while(!stack.isEmpty()){
            output+=stack.pop();
        }
        
        System.out.println("input:"+input);
        System.out.println("output:"+output);
        //Compare
        if(input.compareTo(output)==0){
            System.out.println(input+" is palindrome");
        }else{
            System.out.println(input+" is not palindrome");
        }
    }
    
}
