package oop_lab6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ExerciseReverse {
    public static void main(String[] args) throws IOException {
//        BufferedReader
        String name = "Tuktik Wiparat Seesatja";
        StringTokenizer myToken = new StringTokenizer(name);
//        countToken
        System.out.println(myToken.countTokens());
        while (myToken.hasMoreTokens()){
            StringBuffer buffer = new StringBuffer(myToken.nextToken());
            System.out.print(buffer.reverse()+" ");
        }//while

    }//mian
}//class
