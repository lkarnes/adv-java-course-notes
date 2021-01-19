public class ListDriver {
    public static void main(String[] args){
        List<String> glist = new List<String>(10);
        glist.add("chicken");
        glist.add("flour");
        glist.add("eggs");
        System.out.print(glist.toString());
        List<Integer> numbers = new List<Integer>(5);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println(numbers.toString());
    }
}
