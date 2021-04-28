
package stack;

public class Stack<E> {
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
}
