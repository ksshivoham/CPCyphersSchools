/**
 * ValidParenthesis
 */

import java.util.*;

public class ValidParenthesis {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
      
String str=s.nextLine();
boolean flag=check(str);
if(flag)
{
    System.out.println("balanced");
}
else
{
    System.out.println("not balanced"); 
}
    }

    private static boolean check(String str) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='[')
            {
                stack.push(str.charAt(i));
            }
            else{
                if(stack.isEmpty())
                {
                    return false;
                }
                else
                if(matching(stack.peek(),str.charAt(i))==false)
                {
                    return false;
                }
                else
                {
                    stack.pop();
                }
            }
        }
        return stack.empty()==true;
    }

    private static boolean matching(Character peek, char charAt) {
        if(peek=='(' && charAt==')' || peek=='{' && charAt=='}' || peek=='[' && charAt==']')
        {
            return true;
        }
        return false;
    }
}