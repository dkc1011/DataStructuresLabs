package Lab5;

public class RecursiveDriver {
    public static void main(String[] args) {
        System.out.println("Factorial: " + factorial(5));

        int[] smallestArray = {11, 15, 23,56,62,17,23};
        int smallest = findSmallest(smallestArray);

        System.out.println("Smallest value in array: " + smallest);
    }

    public static int factorial( int n )
    {
        if ( n == 1 || n == 0 )  // base case
            return 1;
        else {
            int result = n * factorial(n-1);
            return result;
        }
    }

    public static int findSmallest(int[] array)
    {
        return subFindSmallest(array, array.length - 1);
    }

    private static int subFindSmallest(int[] array, int lastIndex)
    {
        int smallest = 0;
        if(lastIndex == 0)
        {
            return array[lastIndex];
        }
        else {
            smallest = subFindSmallest(array, lastIndex - 1);
            if (smallest < array[lastIndex])
            {
                return smallest;
            }
            else {
                return array[lastIndex];
            }
        }
    }
}

