import java.util.HashMap;

public class Grades {

    public static void main(String[] args){
        HashMap<String, Integer> grades = new HashMap<String, Integer>();
        grades.put("Logan", 88);
        grades.put("Isa", 99);
        grades.put("Trevor", 81);
        grades.put("Kindred", 95);
        System.out.println("Logans grade: " + grades.get("Logan"));
        System.out.println("Size of grades " + grades.size());
        if(grades.containsKey("Trevor")){
            grades.remove("Trevor");
        }
        
        System.out.println("Size of grades " + grades.size());
    }
    
}
