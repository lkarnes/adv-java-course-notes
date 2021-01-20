import java.util.PriorityQueue;
public class Line {
    public static void main(String[] args){
        PriorityQueue<String> names = new PriorityQueue<String>();
        names.add("Logan");
        names.add("Isa");
        names.add("Kindred");
        names.add("Len");
        for (String name : names) {
            System.out.println(name);
        }
        names.poll();
        System.out.println("head removed =>");
        for (String name : names) {
            System.out.println(name);
        }
        names.remove("Len");
        System.out.println("Len removed =>");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("peeking the head of the line: " + names.peek());
    }
}
