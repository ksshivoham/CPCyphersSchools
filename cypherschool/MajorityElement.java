
import java.util.*;

class MajorityElement {
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0)
		{
		    boolean flag=true;
		    int n=s.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=s.nextInt();
		    }
		    HashMap<Integer,Integer> h=new HashMap<>();
		    for(int i=0;i<n;i++)
		    {
		        if(h.containsKey(a[i]))
		        {
		            int count=h.get(a[i])+1;
		            if(count>a.length/2)
		            {
		                System.out.println(a[i]);
		                flag=false;
		                break;
		            }
		            else
		            {
		                h.put(a[i],count);
		            }
		        }
		        else
		        {
		            h.put(a[i],1);
		        }
		        		              

		    }
		    if(flag){  System.out.println(-1);}
		    
		}
	}
}