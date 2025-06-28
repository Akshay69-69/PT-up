import java.io.*;
import java.util.*;

public class Scholarship {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int y = sc.nextInt();
        long inc = sc.nextLong();
        int arr = sc.nextInt();
        float m = sc.nextFloat();
        float att = sc.nextFloat();
        if(a >= 18 && a < 21 && y >= 2021 && m >= 60)
        {
            if(arr > 2 && m >= 80 || inc >= 200000 && inc < 250000)
            {
                System.out.println("Partially Eligible");
            }
            else if(arr<2 || inc < 200000)
            {
                System.out.println("Eligible");
            }
        }
    }
}
