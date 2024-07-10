
public class Practice4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String a="test123string";
        String b="123";
        
        if(a.contains(b)) {
            System.out.println("b is available in a");
            char bval=b.charAt(0);
            for(int i=0;i<a.length();i++) {
                if(bval==a.charAt(i)) {
                    System.out.println("Starting index is : "+i);
                    break;
                }
            }
            
        }else {
            System.out.println("b is not available in a");

        }

    }

}
