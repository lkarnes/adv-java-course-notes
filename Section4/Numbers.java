import java.util.TreeMap;
public class Numbers {
    public static void main(String[] args){
        TreeMap<String, String> numbers  = new TreeMap<String, String>();
        numbers.put("Logan", "1009");
        numbers.put("Isa", "1011");
        numbers.put("Kindred", "1010");
        System.out.println("Logan: " + numbers.get("Logan"));
        numbers.put("Dave", "1012");
        System.out.println("Size: " + numbers.size());
        numbers.remove("Dave");
        System.out.println("Size: " + numbers.size());
    }
}
