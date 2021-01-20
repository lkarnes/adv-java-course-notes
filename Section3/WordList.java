import java.util.TreeSet;
public class WordList {
    public static void main(String[] args){
        String text;
        text = "winston is one of the most laid-back people"+
        " i know he is tall and slim with black hair and he "+
        "always wears a t-shirt and black jeans his jeans "+
        "have holes in them and his baseball boots are scruffy"+
        " too he usually sits at the back of the class and he "+
        "often seems to be asleep however when the exam results"+
        " are given out he always gets an A i don't think hes as"+
        " lazy as he appears to be";
        String[] words = text.split(" ");
        for(String w: words){
            System.out.print(w + " ");
        }
        System.out.println();
        System.out.println("number of words: " + text.length());
        TreeSet<String> wordList = new TreeSet<String>();
        for(String w: words){
            wordList.add(w);
        }
        System.out.println("total number of unique words is: " + wordList.size());
        for(String w: wordList){
            System.out.println(w);
        }
    }
}
