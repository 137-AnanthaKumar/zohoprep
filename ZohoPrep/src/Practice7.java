
public class Practice7 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String input="radad fggh";
        
        System.out.println(checkInput(input));
      
    }

    private static boolean checkInput(String input) {
        // TODO Auto-generated method stub
        int length=input.length();
        
        int ini=0;
        int last=length-1;
        char[] ch=input.toCharArray();
        while(ini<last) {
            if(ch[ini]==ch[last]) {
                ini++;
                last--;
                
            }else {
                System.out.println("Not A Palindrome");
                return false;
                
            }
        }
        
        return true;
            }

}
