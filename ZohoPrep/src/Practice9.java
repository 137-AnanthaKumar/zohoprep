import java.util.Scanner;

public class Practice9 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        
        int [][] input=new int[10][10];
        
        for(int i=0;i<10;i++) {
            for(int j=0;j<10;j++) {
                input[i][j]=sc.nextInt();
            }
        }
        
        int total=0;
        for(int i=0;i<10;i++) {
            total=total+input[i][i];
        }

        System.out.println("Total is :"+total);
    }

}
