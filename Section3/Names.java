import java.util.HashSet;
public class Names {
    public static void main(String[] args){
        HashSet<String> names = new HashSet<String>();
        //hashsets are essentially objects
        names.add("Logan");
        names.add("Isa");
        names.add("Kindred");
        System.out.print("THe number of names is " + names.size());
        for (String n : names){
            System.out.println(n);
        }
        names.remove("Logan");
        names.add("Len");
        String name = "Logan";
        if (names.contains(name)){
            System.out.println( name + " has not been removed");
        }else{
            System.out.println( name + " is not in the collection");
        }
        names.clear();
        System.out.println(names.size());
    }
}
