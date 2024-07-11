import java.util.Stack;

public class LeadCode {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int first = Integer.MAX_VALUE;
        System.out.println(first);
        
        char[] a= {'a','a','b','b','c','c','c'};
              
        StringBuilder builder=new StringBuilder();
        char currentLetter=0;
        int count=0;
        
        for(char ch:a) {
            if(currentLetter==0) {
                currentLetter=ch;
                builder.append(ch);
                count++;
            }else if(ch==currentLetter) {
                count++;
              
            }else {
                builder.append(count);
                currentLetter=ch;
                count=1;
                builder.append(ch);
            }
            
        }
        builder.append(count);
        
        char[] outC=new char[builder.length()];
        int i=0;
        for(char oc:builder.toString().toCharArray()){
            outC[i]=oc;
            i++;
            
        }
        
        System.out.println(outC);
        
        

    }

}
