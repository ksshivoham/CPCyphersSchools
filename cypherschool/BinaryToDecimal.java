import java.util.*;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        toDecimal(n);
    }

    private static void toDecimal(int n) {
        int dec=0;
        int base=1;
        while(n>0)
        {
            int temp=n%10;
            temp=temp*base;
            dec+=temp;
            base=base*2;
            n=n/10;

        }
        System.out.println(dec);
    }
    
}