import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //Scanner sc = new Scanner(System.in);
        try{
        
            //int x = new Integer(sc.nextInt());
            //int y = new Integer(sc.nextInt());
            int x=10;
            int y=20;
            System.out.println(""+(x/y));
        }catch (InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
            
        }catch(Exception e){
            System.out.println(e);
        
            
        }
    }
}
