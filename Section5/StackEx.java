import java.util.*;
public class StackEx {
    public static void main(String[] args){
        Stack names = new Stack();
        names.push("Raymond");
        names.push("Dave");
        names.push("Steve");
        System.out.println("Top of Stack: " + names.peek());
    }
    
}
