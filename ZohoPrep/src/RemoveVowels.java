import java.util.Scanner;

public class RemoveVowels {
   
    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        
        char[] inp=input.toLowerCase().toCharArray();
        
        StringBuilder builder=new StringBuilder();
        
        int index=0;
        for(char c:inp) {
            
            
            if(checkIsvoual(c)) {
                
                
                if(inp.length!=index+1 && inp[index]==inp[index+1]) {
                    builder.append(c);
                    builder.append(inp[index+1]);

                }
                
                
            }else {
                builder.append(c);

            }
           
            index++;
        }
        System.out.println("Out Put: "+builder.toString());
        
    }

    private static boolean checkIsvoual(char c) {
        // TODO Auto-generated method stub
        return c=='a' || c=='e' || c=='i'|| c=='o'|| c=='u' ;
    }
}
