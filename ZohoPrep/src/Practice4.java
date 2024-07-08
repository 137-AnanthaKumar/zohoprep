
public class Practice4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String a="test123string";
        String b="1234";
        
        if (a.contains(b)) {
            System.out.println("String b is available in string A");
            char[] ac = a.toCharArray();
            char[] bc = b.toCharArray();
            String initialB = String.valueOf(bc[0]);
            
            for (int i = 0; i < ac.length; i++) {
                if (initialB.equalsIgnoreCase(String.valueOf(ac[i]))) {
                    System.out.println("Found the val: " + initialB + " " + ac[i]);
                    System.out.println("Found the index: " + i);
                    break;
                }
            }
        
            
            
        }else{
         System.out.println("-1");
        }

    }

}
