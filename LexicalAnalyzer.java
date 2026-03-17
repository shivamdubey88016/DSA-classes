import java.util.*;

public class LexicalAnalyzer {

    public static void main(String[] args) {

        String code = "int a = 10; if(a > 5) return a;";

        String[] keywords = {
            "int","float","char","double","if","else",
            "while","for","return","break","continue"
        };

        String[] tokens = code.split("\\W+");  
        for(String token : tokens){
            for(String key : keywords){
                if(token.equals(key)){
                    System.out.println(token + " : Keyword");
                }
            }
        }
    }
}