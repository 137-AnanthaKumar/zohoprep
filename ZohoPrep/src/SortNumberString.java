import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SortNumberString {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        
        List<String> inpTexts=new ArrayList<String>(Arrays.asList(input.split(" ")));
        List<Integer> numbersInt=new ArrayList<Integer>();

        for(int i=0;i<=100;i++) {
            numbersInt.add(i);
        }
        
        Map<Integer,String> mapedval=new HashMap<Integer, String>();
        
        for(String is:inpTexts) {
            for(char c:is.toCharArray()) {
                if(Character.isDigit(c)) {
                    System.out.println("FOUND "+c +" under "+is );
                    mapedval.put(Integer.parseInt(String.valueOf(c)), removeNumberFromText(is,c));
                    break;
                }
            }
        }
        
        
        Map<Integer, String> sortedMap = new TreeMap<>(mapedval);
        System.out.println(sortedMap);
        
        for(Map.Entry<Integer, String> val:sortedMap.entrySet()) {
            System.out.print(val.getValue()+" ");
            
        }


        
        
        

    }
    
    static String removeNumberFromText(String is,char c) {
        
        
        return is.replace(String.valueOf(c), "");
        
    }

}
