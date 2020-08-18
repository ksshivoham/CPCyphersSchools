import java.util.*;
public class NextGreaterElement {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
       {
           a[i]=s.nextInt();
       } 
       getNextGreater(a,n);
    }

    private static void getNextGreater(int[] a, int n) {
        Stack<Integer> stack=new Stack<>();
        stack.push(a[n-1]);
        int[] b=new int[n];
b[n-1]=-1;
        for(int i=n-2;i>=0;i--)
        {
            while(stack.isEmpty()==false && stack.peek()<=a[i])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                b[i]=-1;
            }
            else
            {
            b[i]=stack.peek();
            }
            stack.push(a[i]);
        }
        for(int i:b)
        {
            System.out.print(i+" ");
        }
    }
}