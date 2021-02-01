import java.util.TreeMap;
import java.util.*;

public class WordCount {
    public static void main (String[] args){
        String text;
        TreeMap<String, Integer> wordCount = new TreeMap<String, Integer>();
        text  = "Lorem ipsum dolor sit amet consectetur adipiscing elit Cras dolor dui blandit nec ex eget dignissim fringilla turpis Vestibulum viverra est nec bibendum euismod erat est sollicitudin purus eu mattis lacus lorem sed leo Cras congue velit et risus vehicula imperdiet Ut iaculis et purus sed fermentum Duis scelerisque nunc sem nec mattis urna vestibulum sed Sed tristique finibus elit id elementum ex congue quis Nullam ut dui efficitur interdum elit ut facilisis odio Aliquam erat volutpat Donec pellentesque augue et urna varius porta";
        text = text.toLowerCase();
        String[] words = text.split(" ");
        for(String word: words){
            if(wordCount.containsKey(word)){
                int count = wordCount.get(word);
                wordCount.put(word, ++count);
            }else{
                wordCount.put(word, 1);
            }
        }
        Set set = wordCount.entrySet();
        Iterator i = set.iterator();
        while(i.hasNext()){
            Map.Entry me = (Map.Entry)i.next();
            System.out.println(me.getKey() + ": " + me.getValue());
        }
    }    
}
