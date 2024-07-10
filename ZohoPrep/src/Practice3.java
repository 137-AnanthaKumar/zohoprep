

public class Practice3 {

 public static void main(String[] args) {
        
        String input="1234567";
        char[] in=input.toCharArray();
        
        //1   5
        // 2 4
        //  3
        // 2 4
        //1   5  
        
        int line=1;
        
        
        for(int j=0;j<in.length;j++) {
            int inital=getIntex(line,in.length);
            int fin=getIntexFin(line,in.length);
            for(int i=0;i<in.length;i++) {
                
                if(inital==i || fin==i) {
                    System.out.print(in[i]);
                }else {
                    System.out.print(" ");

                }
                
            }  
            System.out.println();
            line++;
        }
       
        
        
        
        
    }
    private static int getIntexFin(int line, int length) {
        // TODO Auto-generated method stub
        return length-line;
    }
    // 1 - 1, 5
     //2  - 2, 4

    private static int getIntex(int line, int len) {
        // TODO Auto-generated method stub
        
        
        return line-1;
    }

    
    



}
