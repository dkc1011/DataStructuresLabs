package Lab3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedEquationTest {

    @Test
    void main() {
    }

    @Test
    void isBalanced() {
        String s1 = "( a + b * ( c / ( d – e ) ) ) + ( d / e )";
        boolean actual = BalancedEquation.isBalanced(s1);
        boolean expected = true;

        //Expected Pass
        assertEquals(expected, actual);

        s1 = "( a + b * ( c / ( d – e ) ) + ( d / e )";
        actual = BalancedEquation.isBalanced(s1);
        expected = false;

        //Expected Pass
        assertEquals(expected, actual);

        s1 = "< a + b * { c / ( d – e ) } > + ( d / e )";
        actual = BalancedEquation.isBalanced(s1);
        expected = true;

        //Expected Pass
        assertEquals(expected, actual);

        s1 = "< a + b * { c / ( d – e ) } ) + ( d / e )";
        actual = BalancedEquation.isBalanced(s1);
        expected = false;

        //Expected Fail
        assertEquals(expected, actual);

        s1 = "(2+[5+7]+1)";
        actual = BalancedEquation.isBalanced(s1);
        expected = true;

        //Expected Pass
        assertEquals(expected, actual);
    }
}