import java.util.*;
public class CheckMirrorInverseArray {
    public static void main(String[] args) {
        int a[]={3,4,2,0,1};
        if(mirror(a))
        {
            System.out.println("yes");
        }
        else{
            System.out.println("no");

        }
    }

    private static boolean mirror(int[] a) {
        for(int i=0;i<a.length;i++)
        {
            if(a[a[i]]!=i)
            {
                return false;
            }
        }
        return true;
    }
}