import java.lang.reflect.Array;
import java.util.ArrayList;
/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false */

public class ValidParenthese {
    public static void main(String[] args) {
       String parenthese= ("(]");
       ArrayList<Character> stack = new ArrayList<>();
       boolean good = true;
    
       for (int i = 0; i < parenthese.length(); i++) {
            if (parenthese.charAt(i)=='(' || parenthese.charAt(i)=='[' || parenthese.charAt(i)=='{') {
                stack.add(parenthese.charAt(i));
            } else{
                if (parenthese.charAt(i)==')'){
                    if ('('!=stack.get(stack.size()-1)) {
                        good = false;
                        break;
                    }else{
                        stack.removeLast();
                    }
                }else if (parenthese.charAt(i)==']') {
                    if ('['!=stack.get(stack.size()-1)){
                        good = false;
                        break;
                    }else{
                        stack.removeLast();
                    }
                }else{
                    if('{'!=stack.get(stack.size()-1)){
                        good = false;
                        break;
                    }else{
                        stack.removeLast();
                    }
                }  
            }
        }
        System.out.println(good);
    }
}
