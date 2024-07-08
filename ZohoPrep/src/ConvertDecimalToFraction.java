import java.util.Scanner;

public class ConvertDecimalToFraction {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
        
        double input=sc.nextDouble();
        //2.95 -- 95 --100-95- 5
        // 100/5 20 , 95/5 ->19
        
        int fractionNum= (int) (input % 1 *100);  //95
        int integerPart = (int) input;  //2
        
        int newhead=fractionNum;
        int newdiv=100;
        
        for(int i=1;i<100;i++) {
            if(newhead%i==0 && newdiv%i==0) {
                newhead=newhead/i;
                newdiv=newdiv/i;
                i=1;
                System.out.println("Valu "+newhead+"/"+newdiv);
                
            }
        }
        

        
        String output=integerPart +" "+newhead+"/"+newdiv;
        System.out.println(output);
        
    }

}
