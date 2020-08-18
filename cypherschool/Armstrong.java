import java.util.*;;
public class Armstrong {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int t=n;
        int sum=0;
        while(t!=0)
        {
            int c=t%10;
            sum=sum+(c*c*c);
            t=t/10;
        }
        if(sum==n)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
 
        }
    }
}