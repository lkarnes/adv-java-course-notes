import java.util.ArrayList;
public class AList {
    public static void main(String[] args){
        //arraylist grow and shrink unlike arrays which have a set length
        ArrayList<Integer> grades = new ArrayList<Integer>();
        grades.add(98);
        grades.add(89);
        grades.add(87);
        grades.add(99);
        int total = 0;
        // for( int i = 0; i < grades.size(); ++i){
        //     total += grades.get(i);
        // }
        //for each loop
        for(Integer grade: grades) {
            total += grade;
        }
        double average = total / grades.size();
        System.out.println("Number of grades is " + grades.size() + " the average is: " + average);
        grades.remove(3);
        System.out.println("New Size: " + grades.size());
        grades.add(88);
        grades.add(88);
        System.out.println("Newer Size: " + grades.size());
        
    }
}
