package Lab3;

import java.util.Deque;
import java.util.LinkedList;

public class BalancedEquation {
    public static void main(String[] args) {
        String expression = "( a + b * ( c / ( d – e ) ) ) + ( d / e )";

        //Expected Balanced
        printBalanced(expression);

        expression = "( a + b * ( c / ( d – e ) ) + ( d / e ";

        //Expected Unbalanced
        printBalanced(expression);

        expression = "( a + b * { c / ( d – e )} ) + [ d / e]";

        //Expected Balanced
        printBalanced(expression);

        expression = "( a + b * { c / ( d – e )} } + [ d / e>";

        //Expected Unbalanced
        printBalanced(expression);
    }

    public static void printBalanced(String expression)
    {

        if(isBalanced(expression))
        {
            System.out.println("Equation is balanced");
        }
        else
        {
            System.out.println("Equation is unbalanced");
        }
    }

    public static boolean isBalanced(String expression)
    {
        Deque<Character> stack = new LinkedList();
        boolean balanced = true;
        int index = 0;
        while (balanced && index < expression.length())
        {
            char ch = expression.charAt(index);
            if(isOpen(ch))
            {
                stack.push(ch);
            }
            else if(isClosed(ch))
            {
                if(stack.isEmpty())
                {
                    balanced = false;
                }
                else {
                    char topChar = stack.pop();

                    if (!isMatching(topChar, ch)) {
                        balanced = false;
                    }
                }
            }

            index++;
        }

        if(balanced && stack.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private static boolean isOpen(char ch)
    {
        if(ch == '(' || ch == '[' || ch == '<' || ch == '{')
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private static boolean isClosed(char ch)
    {
        if(ch == ')' || ch == ']' || ch == '>' || ch == '}')
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private static boolean isMatching(char c1, char c2)
    {
        if(c1 == '(' && c2 == ')')
        {
            return true;
        }
        else if(c1 == '[' && c2 == ']')
        {
            return true;
        }
        else if(c1 == '<' && c2 == '>')
        {
            return true;
        }
        else if(c1 == '{' && c2 == '}')
        {
            return true;
        }
        else
        {
            return false;
        }
    }



}
