import java.io.*; 
  
/**
 * SolidAndHollowRhombus
 */
public class SolidAndHollowRhombus 

{ 
    static void solidRhombus(int rows) 
    { 
        int i, j; 
        for (i=1; i<=rows; i++) 
        { 
            for (j=1; j<=rows - i; j++) 
                System.out.print(" "); 
               
            for (j=1; j<=rows; j++) 
                System.out.print("*"); 
               
            System.out.println(); 
        } 
    } 
   
    static void hollowRhombus(int rows) 
    { 
        int i, j; 
        for (i=1; i<=rows; i++) 
        { 
            for (j=1; j<=rows - i; j++) 
                System.out.print(" "); 
               
            if (i==1 || i==rows) 
                for (j=1; j<=rows; j++) 
                    System.out.print("*"); 
                   
            else
                for (j=1; j<=rows; j++) 
                    if (j==1 || j==rows) 
                        System.out.print("*"); 
                    else
                        System.out.print(" "); 
            System.out.println(); 
        } 
    } 
   
    static void printPattern(int rows) 
    { 
        System.out.println("Solid Rhombus:"); 
        solidRhombus(rows); 
       
        System.out.println("Hollow Rhombus:"); 
        hollowRhombus(rows); 
    } 
      
    public static void main (String[] args)  
    { 
        int rows = 5; 
        printPattern (rows); 
    } 
} 