package com.ruchi.prac;

public class Demo {

    static void printRotatedString(String str)
    {
        int len = str.length();
      
        
        StringBuffer sb;
         
        for (int i = 0; i < len; i++)
        {
            sb = new StringBuffer();
             
            int j = i;  // Current index in str
            int k = 0;  // Current index in temp
      
            for (int k2 = j; k2 < str.length(); k2++) {
                sb.insert(k, str.charAt(j));
                k++;
                j++;
            }
     
            j = 0;
            while (j < i)
            {
                sb.insert(k, str.charAt(j));
                j++;
                k++;
            }
      
            System.out.println(sb);
        }
    }
     
   
    public static void main(String[] args)
    {
        String  str = new String("MPHASIS");
        printRotatedString(str);
    }
}