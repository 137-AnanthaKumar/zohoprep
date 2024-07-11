import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class LastMin {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // String1();
        // String2();
        // String3();

        // Pattern1();
        // Pattern2();
        // Pattern3();

        // Array1();
        // Array2();
        //  Array3();
        //Array4();
       // Array5();
        //Array6();
        Array7();


    }

   

    private static void Array7() {
    // find max and min
        int [] a= {2,6,2,5,3,1};
        
     
        int max=a[0]>a[1]?a[0]:a[1];
        int min=a[0]<a[1]?a[0]:a[1];
        
        for(int i=0;i<a.length;i++) {
            if(max<=a[i]) {
                max=a[i];
            }else if(max>a[i] && min>a[i] ){
                min=a[i];
            }
        }
        System.out.println(min+" "+max);
    }



    private static void Array6() {
        // find second largets val and find largest
        int [] a= {2,6,2,5,3};
//        Arrays.sort(a);
//        System.out.println(a[a.length-2]);
        
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++) {
            if(first<=a[i]) {
                first=a[i];
            }else if(second<=a[i] ){
                second=a[i];
            }
        }
        System.out.println(second);
        
    }

    private static void Array5() {
        // find leaders
        int[] a= {16,17,4,3,5,2};
        // 17 , 5 2
        StringBuilder builder=new StringBuilder();
        
         for(int i=0;i<a.length;i++) {
             int k=i;
             while(k<a.length) {
                 if(a[i]<a[k] ){
                     break;
                 }else {
                     if(k==a.length-1) {
                         builder.append(a[i]);
                     }
                    


                 }
                 k++;
             }
         }
         System.err.println(builder.toString());
        
        // TODO Auto-generated method stub
        
    }

    private static void Array4() {
        // fina a pair
        
        int[] a= {2,4,3,2,7,1};
        int sum=71;
        boolean found=false;
        for(int i=0;i<a.length;i++) {
            
            int k=0;
           
            
            while(k<a.length) {
                if(k!=i && sum==a[i]+a[k]) {
                    found=true;
                    break;
                }
                
                k++;
                
            }
            
            if(found) {
                break;
            }
        }
        System.out.println(sum+" pair is "+found);
        
        
    }

    private static void Array3() {
        // remove duplicate from sorted array and total count
        int[] a = {1, 1, 2, 2, 3, 4, 5, 5};
 // 0 1 2 3 4  5 6 7

        int count = 1;
        int prev = 0;
        if (a.length == 0)
        {
            count = 0;
        }
        for (int i = 1; i < a.length; i++)
        {
            System.out.println(a[i - 1] + " " + a[i]);
            if (a[i - 1] != a[i])
            {
                count++;
            }


        }
        System.out.println(count);


        // TODO Auto-generated method stub

    }

    private static void Array2() {
        // TODO Auto-generated method stub
        // move 2 posi
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int n = 2;

        for (int i = 1; i <= n; i++)
        {
            int myTem = a[0];
            int k = 0;
            while (k < a.length)
            {
                if (k == 0)
                {
                    myTem = a[k];
                    a[k] = a[a.length - 1];
                }
                else if (k == a.length - 1)
                {
                    a[k] = myTem;
                }
                else
                {
                    int tem = myTem;
                    myTem = a[k];
                    a[k] = tem;
                }
                k++;
            }

        }


        // 1 2 3 4 5 6 7
        // 7 2 1 3 4 5 6
        // 6 2 7 1 3 4 5



        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        //

    }

    private static void Array1() {

        // 7 1 6 2 5 3 4
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        Arrays.sort(a);

        int[] out = new int[a.length];

        int start = 0;
        int end = a.length - 1;
        int i = 0;
        while (start < end)
        {


            out[i] = a[end];
            out[i + 1] = a[start];
            end--;
            start++;


            i = i + 2;

        }
        if (a.length % 2 != 0)
        {
            int fi = (a.length / 2);
            out[a.length - 1] = a[fi];
        }
        System.out.println(start + " " + end + " ");



        for (int j = 0; j < a.length; j++)
        {
            System.out.print(out[j] + " ");
        }



    }

    private static void Pattern3() {
        // Pyrmid

        int num = 4; // Number of levels in the pyramid
        int x = 0; // Variable used to calculate values in the pyramid

        // Outer loop for rows
        for (int i = 1; i <= num; i++)
        {
            x = i - 1; // Update x for each row

            // Inner loop for spaces before the numbers in the i-th row
            for (int j = i; j <= num - 1; j++)
            {
                // First Number Space
                System.out.print(" ");
                // Space between Numbers
                System.out.print(" ");
            }

            // Pyramid printing: left part of the pyramid
            for (int j = 0; j <= x; j++)
            {
                // Print the numbers in increasing order
                System.out.print((i + j) < 10 ? (i + j) + " " : (i + j) + " ");
            }

            // Pyramid printing: right part of the pyramid
            for (int j = 1; j <= x; j++)
            {
                // Print the numbers in decreasing order
                System.out.print((i + x - j) < 10 ? (i + x - j) + " "
                        : (i + x - j) + " ");
            }

            // Move to the next line after each row
            System.out.println();
        }


        // TODO Auto-generated method stub

    }

    // 4 5 3
    //

    private static String canAdd(int j, int midPos, int line, int midnumber) {

        int totalNumber = line - 1; // 2
        int index = 5;

        if (midPos < j)
        {

            for (int i = 1; i <= totalNumber; i++)
            {
                if (index + totalNumber == j)
                {
                    return String.valueOf(midnumber - 1);
                }
                index = index - 1;
                midnumber = midnumber - 1;
            }
            index = 5;

            return " ";

        }
        else
        {
            for (int i = 1; i <= totalNumber; i++)
            {
                if (index - totalNumber == j)
                {
                    return String.valueOf(midnumber - 1);
                }
                index = index + 1;
                midnumber = midnumber + 1;

            }
            index = 5;
            return " ";

        }

        // 5 5 1 1 only 5
        // 1 5 2 2 1 from mid
        // 3 1,2 from ,mid
        // 4 1,2,3 from mid
        // 2-1=1
        // 1<5 --> j==(5-1)
        // 6>5 --> j==(5+1)

        //

    }

    private static void Pattern1() {
        int input = 5;
        // * 1 - 1 1+1
        // * * 1 2 -2
        // * * * 1 2 4 -3
        // * * * * 1 2 4 6 -4
        // * * * * * 1 2 4 5 8 -5
        int line = 1;
        for (int i = 1; i <= input; i++)
        {

            for (int j = 1; j <= input * 2; j++)
            {
                if (canPrintRight(j, line))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");

                }
            }
            line++;
            System.out.println();

        }

    }

    private static void Pattern2() {
        int input = 5;
        // * 1 - 1 1+1
        // * * 1 2 -2
        // * * * 1 2 4 -3
        // * * * * 1 2 4 6 -4
        // * * * * * 1 2 4 5 8 -5
        int line = 1;
        for (int i = 1; i <= input; i++)
        {

            for (int j = 1; j <= input * 2; j++)
            {
                if (canPrintLeft(j, line))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");

                }
            }
            line++;
            System.out.println();

        }

    }

    private static boolean canPrintLeft(int j, int line) {
        // TODO Auto-generated method stub


        int total = 9;
        for (int i = 1; i <= line; i++)
        {
            if (j == total)
            {
                return true;
            }
            total = total - 2;

        }

        return false;
    }

    // 1 1 --> true
    // 1 2--> true
    // 2 2--> true
    // 2 2 --> ture
    // 0 3 --> true
    // 1 3 --> false
    private static boolean canPrintRight(int j, int line) {

        int total = 1;
        for (int i = 1; i <= line; i++)
        {
            if (j == total)
            {
                return true;
            }
            total = total + 2;

        }

        return false;

    }

    private static void String3() {
        // Reverse String using Stack
        String str = "Hello";
        Stack<Character> st = new Stack<Character>();

        for (char c : str.toCharArray())
        {
            st.push(c);
        }

        char[] rever = new char[str.length()];

        int j = 0;
        while (!st.isEmpty())
        {
            rever[j++] = st.pop();



        }
        String a = new String(rever);
        System.out.println(a);

    }

    private static void String2() {
        // Input : 00000123569
        // Output: 123569
        //
        // Input: 000012356090
        // Output: 12356090
        String str = "000012356090";
        String newstr = "";
        int ind = 0;
        for (int i = 0; i < str.length(); i++)
        {
            char p = str.charAt(i);
            if (p != '0')
            {
                ind = i;
                break;
            }
        }
        newstr = str.substring(ind, str.length());
        // Printing leading zeros inside string
        System.out.println(newstr);

    }

    private static void String1() {

        // Input: String = "Geeks Gor Geeks", index = 6, ch = 'F'
        // Output: "Geeks For Geeks."

        String str = "Geeks Gor Geeks";
        int index = 6;
        char ch = 'F';

        str = str.substring(0, index) + ch + str.substring(index + 1);
        System.out.println(str);
    }

}
