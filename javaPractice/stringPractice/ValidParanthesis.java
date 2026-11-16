package javaPractice.stringPractice;

import java.util.Stack;

public class ValidParanthesis {
    // Validate if paranthesis is valid enclosed e.g () is valid & (( invalid
    // Use stack Push & POP

    public static boolean isValid(String input)
    {
        if (input.length()%2 != 0 || input == null)
            return false;

        char[] inputArray= input.toCharArray();

        Stack<Character> stack = new Stack<>();
        for (char ch : inputArray)
        {
            if(ch == '(')
            {
                stack.push('(');
            }
              else if (stack.isEmpty() || stack.pop() != '(') {
                return false;
            }
        }        
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(isValid("())"));
    } 
}
