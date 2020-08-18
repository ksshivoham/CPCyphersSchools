/**
 * NthPrimeNo
 */
import java.util.*;
public class NthPrimeNo {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count=0;
        int num=1;
        int i;
        while(count<n)
        {
            num=num+1;
            for(i=2;i<=num;i++)
            {
                if(num%i==0)
                {
break;
                }
            }
            if(num==i)
            {
count++;
            }
        }
        System.out.println(num);
    }
}