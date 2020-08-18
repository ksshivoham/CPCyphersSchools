package backtracking;

import java.util.*;

/**
 * Nqueenproblem
 */
public class Nqueenproblem {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sol[][]=new int[n][n];
        boolean flag=solve(n,sol,0);
        if(flag)
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(sol[i][j]+" ");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println(-1);
        }
    }

    private static boolean solve(int n, int[][] sol,int c) {
        if(c==n)
        {
            return true;
        }
       for(int i=0;i<n;i++)
       {
           if(isSafe(n,sol,c,i))
           {
               sol[i][c]=1;
               if(solve(n, sol, c+1))
               {
                   return true;
               }
               sol[i][c]=0;
           }
       }
return false;
    }

    private static boolean isSafe(int n, int[][] sol, int c, int r) {
        for(int i=0;i<c;i++)
        {
            if(sol[r][i]==1)
            {
                return false;
            }
        }
        for(int i=r, j=c;i>=0 && j>=0;i--,j--)
        {
if(sol[i][j]==1)
{
    return false;
}
        }
        for(int i=r,j=c;i<n && j>=0;i++,j--)
        {
            if(sol[i][j]==1)
            {
                return false;
            }
        }

        return true;
    }
}