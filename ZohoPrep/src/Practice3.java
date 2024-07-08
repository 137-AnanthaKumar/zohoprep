

public class Practice3 {

    public static void main(String[] args) {
           sap2();
    }

    static void sap2() {
        String input="12345";
        char[] chars=input.toCharArray();
        int length=input.length();
       
        int middleIndex=(length/2)+1;
        int totalLines=(middleIndex*2)-1;
        int loopCount=1;
        for(int z=0;z<totalLines; z++) {
            int a=loopCount-1;
            int b=length-loopCount;
            for(int i=0;i<length;i++) {
                if(a==i) {
                    System.out.print(chars[i]);
                }else if(b==i) {
                    System.out.print(chars[i]);

                }else {
                    System.out.print(" ");

                }
                
            }
            loopCount++;
            System.out.println();
            
            
        }
        
        
        
    }
    
    
    



}
