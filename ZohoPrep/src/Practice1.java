import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice1 {

    public static void main(String[] args) {
        
        
       String input="a5b10";
       String output=constructOutput(input);
       
       // out put wwwwwwwwwwwwwwwwwbbbbbbb
      //out put aaaaabbbbbbbbbb

       System.out.println(output);
    }

    private static String constructOutput(String input) {
       
        StringBuilder output=new StringBuilder();
        Pattern pattern=Pattern.compile("([a-zA-z])(\\d+)");
        Matcher matcher=pattern.matcher(input);
        
        while(matcher.find()) {
            char letter=matcher.group(1).charAt(0);
            int count=Integer.parseInt(matcher.group(2));
            for(int i=0; i<count;i++) {
                
                output.append(letter);
          }
            
    }
    
       sam();
        return output.toString();

    }
    
    
    static void sam() {
        String bb="w17b7";
        StringBuilder output=new StringBuilder();
        Pattern pattern=Pattern.compile("([a-zA-Z])(\\d+)");
        Matcher matcher=pattern.matcher(bb);
        while(matcher.find()) {
            
            char letter=matcher.group(1).charAt(0);
            int count=Integer.parseInt(matcher.group(2));
            
           for(int i=0; i<count;i++) {
                output.append(letter);
            }
            
            
        }
        System.out.println(output.toString());
    }

}
