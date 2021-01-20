import java.util.TreeSet;
public class Alpha {
    public static void main(String[] args){
        TreeSet<String> names = new TreeSet<String>();
        //treesets are ordered
        names.add("Logan");
        names.add("Isa");
        names.add("Kindred");
        names.add("Len");
        for(String name : names) {
            System.out.println(name);
        }
        //lower grabs item below the item called starts from bottom of order
        System.out.println("name before Kindred : " + names.lower("Kindred"));
        //higher does the inverse
        System.out.println("name after Kindred : " + names.higher("Kindred"));
        //first
        System.out.println("first name in tree: " + names.first());
        //last
        System.out.println("last name in tree: " + names.last());

    }
}
