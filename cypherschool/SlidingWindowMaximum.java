/**
 * SlidingWindowMaximum
 */
import java.util.*;
public class SlidingWindowMaximum {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        maxofSubarrays(a,n,k);
    }

    private static void maxofSubarrays(int[] a, int n,int k) {

        Deque<Integer> d=new LinkedList<>();
        for(int i=0;i<k;i++)
        {
            while(!d.isEmpty() && a[i]>=a[d.peekLast()])
            {
                d.pollLast();
            }
            d.addLast(i);
        }
        for(int i=k;i<n;i++)
        {
System.out.print(a[d.peek()]+" ");
while(d.isEmpty()==false && d.peek()<=i-k)
{
    d.removeFirst();
}
while(d.isEmpty()==false && a[i]>=a[d.peekLast()])
{
    d.removeLast();
}
d.addLast(i);
        }
        System.out.print(a[d.peek()]+" ");
    }
}