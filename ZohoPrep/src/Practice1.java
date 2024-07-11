import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice1 {

    public static void main(String[] args) {
        
        
       //String input="a10b1";
       String input = "a10b5";
       printLetters1(input);
      // String output=constructOutput(input);
       
       // out put wwwwwwwwwwwwwwwwwbbbbbbb
      //out put aaaaabbbbbbbbbb

       //System.out.println(output);
    }
    
    public static void printLetters1(String input) {
        
        char englistLetter=0;
        StringBuilder number=new StringBuilder();
        for(int i=0;i<input.length();i++) {
            char a=input.charAt(i);
           
            
            if(Character.isLetter(a)) {
               
                 if( number.length()>0) {
                     for(int j=0;j<Integer.parseInt(String.valueOf(number)); j++) {
                         System.out.print(englistLetter);
                         
                     }
                 }
                 englistLetter=a;
                 
                
                 number=new StringBuilder();
            }else if(Character.isDigit(a)) {
                number.append(a);
                
            }
            
            
            
        }
        
        for(int j=0;j<Integer.parseInt(String.valueOf(number)); j++) {
            System.out.print(englistLetter);
            
        }
        
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
    
    
    public static void printLetters(String input) {
        char currentLetter = 0;
        StringBuilder number = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                // If we have a previous letter and number, print it
                if (currentLetter != 0 && number.length() > 0) {
                    int count = Integer.parseInt(number.toString());
                    for (int j = 0; j < count; j++) {
                        System.out.print(currentLetter);
                    }
                }
                // Update current letter and reset number
                currentLetter = ch;
                number = new StringBuilder();
            } else if (Character.isDigit(ch)) {
                number.append(ch);
            }
        }

        // Print the last letter and number
        if (currentLetter != 0 && number.length() > 0) {
            int count = Integer.parseInt(number.toString());
            for (int j = 0; j < count; j++) {
                System.out.print(currentLetter);
            }
        }
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
