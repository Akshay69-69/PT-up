import java.io.*;
import java.util.*;

public class Specialno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int i = 0;
        for(i = n;i<=m;i++)
        {
            int temp = i;
            int mul = 1;
            int sum = 0;
            while(temp != 0)
            {
            sum += (temp%10);
            mul *= (temp%10);
            temp /= 10;
            }
            if(i == sum + mul)
        {
            System.out.println(i);
        }
        }
        
        
    }
}
