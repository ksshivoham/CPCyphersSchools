import java.util.*;
public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int a[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        search(a,12);
    }

    private static void search(int[][] a, int n) {
        int i=0;
        int j=3;  //n-1
        while(i<=3 && j>=0)
        {
            if(a[i][j]==n)
            {
                System.out.println(i+" "+j);
                return;
            }
            else if(a[i][j]<n)
            {
                i++;
            }
            else
            {
                j--;
            }
        }

    }
    
    

}