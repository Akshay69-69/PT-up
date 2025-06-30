import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Denomination {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int amt = sc.nextInt();
        int[] arr = {500,100,50,20,10,5,2,1};
        int[] rem = new int[arr.length];
        for(int i = 0;i<arr.length;i++)
        {
            rem[i] = Math.floorDiv(amt,arr[i]);
            amt = amt%arr[i];
        }
        System.out.println("Total number of notes:");
        for(int i = 0;i<rem.length;i++)
        {
            System.out.println(arr[i]+" : "+rem[i]);
        }
        
        
    }
}
