import java.util.regex.Pattern;

public class Practice5 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String password="ysqljhgbhhh";
        String passStrength=checkPassStrength(password);
        System.out.println(passStrength);

    }

    private static String checkPassStrength(String password) {
        // TODO Auto-generated method stub
        
        int passStrengthStatus=0;
        
        boolean lengthCheck=password.length()>=8;
        
        boolean upperCaseRule=Pattern.compile("[A-Z]").matcher(password).find();
        boolean digitRule=Pattern.compile("[0-9]").matcher(password).find();
        boolean specialCharRule = Pattern.compile("[!@#$%^&*(),.?\":{}|<>]").matcher(password).find();

        if(lengthCheck) passStrengthStatus++;
        
        if(upperCaseRule) passStrengthStatus++;
        if(digitRule) passStrengthStatus++;
        if(specialCharRule) passStrengthStatus++;
        
        switch (passStrengthStatus)
        {
            case 0:
            {
               return "very week";
            }
            case 1:
            {
               return "week"; 
            }
            case 2:
            {
               return "Medium"; 
            }  case 3:
            {
                return "Strong"; 
             }
            case 4:
            {
               return "Very strong"; 
            }
            default:
                return "Week";
        }

        
        
        
        
    }

}
