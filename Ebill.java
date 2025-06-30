import java.io.*;
import java.util.*;

public class Ebill {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        int m = 0;
        if(units > 0 && units<= 200)
        {
            m += (units*0.5);
        }
        else if(units > 200 && units<= 400)
        {
            m += (units*0.65) + 100;
        }
        else if(units > 400 && units<= 600)
        {
            m += (units*0.80) + 200;
        }
        else if(units > 600)
        {
            m += (units*1.25) + 425;
        }
        System.out.print("Rs."+m);
    }
}
