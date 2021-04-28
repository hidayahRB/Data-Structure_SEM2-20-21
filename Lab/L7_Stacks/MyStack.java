package stack;

public class MyStack<E> {
    
    private java.util.ArrayList<E> list = new java.util.ArrayList<>();
    
    public void push(E o){
        list.add(o);
    }
    
    public E pop(){
        E o = list.get(getSize()-1);
        list.remove(getSize()-1);
        return o;
    }
    
    public E peek(){
        return list.get(getSize()-1);
    }
    
    public int getSize(){
        return list.size();
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    public String toString(){
        return "stack: "+list.toString();
    }
    
    public boolean search(E o){
        return list.contains(o);
    }
    
    
    public static void main(String[] args) {
        // Following the given order, add elements, a b and c in the stack.
        MyStack<Character> ms = new MyStack<>();
        ms.push('a');
        ms.push('b');
        ms.push('c');
        // Print the stack.
        System.out.println(ms.toString());
        // Check if element ‘b’ is in the stack.
        System.out.println("b is in the stack : "+ms.search('b'));
        // Check if element ‘k’ is in the stack.
        System.out.println("k is in the stack : "+ms.search('k'));
        
        // add element 1,2,3 in the stack
        MyStack<Integer> ms2 = new MyStack<>();
        ms2.push(1);
        ms2.push(2);
        ms2.push(3);
        // Print the stack.
        System.out.println(ms2.toString());
        // Check if element ‘b’ is in the stack.
        System.out.println("6 is in the stack : "+ms2.search(6));
    }
    
}
