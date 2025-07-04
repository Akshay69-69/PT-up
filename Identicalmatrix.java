import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Identicalmatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<m;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        
        int n1 = sc.nextInt();
        int m1 = sc.nextInt();
        int[][] arr2 = new int[n1][m1];
        int flag = 0;
        for(int i = 0;i<n1;i++)
        {
            for(int j = 0;j<m1;j++)
            {
                arr2[i][j] = sc.nextInt();
                if(n==m && n1==m1)
                {
                    if(arr[i][j] == arr2[i][j])
                    {
                        flag++;
                    }
                    
                    else
                    {
                        System.out.print("NOT IDENTICAL");
                        return;
                    }
                }
                else
                {
                    System.out.print("NOT IDENTICAL");
                    return;
                }
            }
        }
        if(flag == n*m)
        {
            System.out.print("IDENTICAL");
        }
        else
        {
            System.out.print("NOT IDENTICAL");
        }
    }
}
