import java.util.*;

public class SumOfNoRepresentedAsArray {
    public static void main(String[] args) {
        int a[]={1,2,3};
        int b[]={2,5,0};
        sum(a,b);
    }

    private static void sum(int[] a, int[] b) {
        int n1=a.length;
        int n2=b.length;
        int sum1=0;
        int sum2=0;
        for(int i=0;i<n1;i++)
        {
sum1*=10;
sum1+=a[i];
        }
        for(int i=0;i<n2;i++)
        {
sum2*=10;
sum2+=b[i];
        }
        System.out.println(sum1+sum2);

    }
}