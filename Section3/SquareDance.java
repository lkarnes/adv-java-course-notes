import java.util.PriorityQueue;
import java.io.*;
public class SquareDance {
    public static void main(String[] args){
        PriorityQueue<String> men = new PriorityQueue<String>();
        PriorityQueue<String> women = new PriorityQueue<String>();
        String line = null;
        String file = "./names.txt";
        String sex = "";
        BufferedReader input;
        try {
           input = new BufferedReader( new FileReader(file));
           while((line = input.readLine()) != null) {
               sex = line.substring(0,1);
               if(sex.equals("M")){
                   men.add(line.substring(2));
               }else{
                    women.add(line.substring(2));
               }
               
           }
           input.close();
        }catch(IOException except){
            System.out.println("couldnt open " + file);
        }
        while(!men.isEmpty() && !women.isEmpty()){
            System.out.print("The dance partners will be : ");
            System.out.println(men.poll() + " " + women.poll());
        }
        if(men.isEmpty()) {
            System.out.println("there are " + women.size() + " women waiting to dance");
        }
        if(women.isEmpty()) {
            System.out.println("there are " + men.size() + " men waiting to dance");
        }
    }
}
