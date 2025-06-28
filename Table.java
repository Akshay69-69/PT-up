import java.io.*;
import java.util.*;

public class Table {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        System.out.println("Enter n");
        System.out.println("Enter m");
        System.out.println("The multiplication table of "+n+" is");
        for(int i = 1;i<=t;i++)
        {
            System.out.println(i+"*"+n+"="+i*n);
        }
    }
}
