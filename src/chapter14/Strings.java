package chapter14;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
         String s1 ="Welcome";
         String s2 ="welcome";
         s2=s1.replaceAll("e","E");
        System.out.println("s2: "+s2);
        System.out.println();
        String [] token = "Welcome to Java and HTML".split(" ");
        for (String s : token) {
            System.out.println(s + " ");
        }
       String[]s3 = new String[2];
       s3[0]= token[0];
       s3[1]= token[1];
        System.out.println(Arrays.toString(s3));

       String[]s4 = new String[2];
       s4[0]= token[0];
       s4[1]= token[1];
        System.out.println(Arrays.toString(s4));
//        System.out.println();
//        System.out.println("Hi, ABC, good".matches("ABC "));
//        System.out.println("Hi, ABC, good".matches(".*ABC.*"));
//        System.out.println("A,B;C".replaceAll(",;", "#"));
//        System.out.println("A,B;C".replaceAll("[,;]", "#"));
//        String[] tokens = "A,B;C".split("[,;]");
//        for (int i = 0; i < tokens.length; i++)
//            System.out.print(tokens[i] + " ");
}

    }

