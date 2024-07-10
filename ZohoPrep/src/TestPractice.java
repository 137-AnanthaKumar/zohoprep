import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPractice {

    public static void main(String[] args) {
        
      
      String a="Zoho4 i0 like1 jo3in 2to";
      
     List<String> inputList=Arrays.asList(a.split(" "));
     List<String> newList=new ArrayList<String>(inputList);
     Map<Integer, String> input=new HashMap<Integer, String>();
     for(String inS:inputList) {
         StringBuilder builder =new StringBuilder();
         for(char c:inS.toCharArray()) {
             if(Character.isDigit(c)) {
                input.put(Integer.parseInt(String.valueOf(c)), inS.replace(String.valueOf(c), ""));
                break;
                
             }
         }
     }
     System.out.println(input);
     
     
      
     
        
    }

  
    

   

}
