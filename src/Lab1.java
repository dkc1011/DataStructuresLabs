import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Lab1 {
    public static void main(String[] args) {
        ArrayList<String> myAList = new ArrayList<>();
        LinkedList<String> myLList = new LinkedList<>();
        int size = 0;

        try
        {   // The name of the file which we will read from
            String filename = "words_alpha.txt";

            // Prepare to read from the file, using a Scanner object
            File file = new File(filename);
            Scanner in = new Scanner(file);

            // Read each line until end of file is reached
            while (in.hasNextLine())
            {
                // Read one string from the file
                String str = in.nextLine();
                // add str to ArrayList and LinkedList
                myAList.add(str);
                myLList.add(str);

                size++;
            }

            System.out.println(size);

            testGetForArrayList(myAList);
            
            testGetForLinkedList(myLList);
        }

        catch (FileNotFoundException e)
        {
            System.out.println("File not found");

        }

    }

    public static void testGetForArrayList(ArrayList list)
    {
        testGetForList(list);
    }

    public static void testGetForLinkedList(LinkedList list)
    {
        testGetForList(list);
    }

    public static void testGetForList(List list) {
        int listSize = list.size();
        Random random = new Random();
        int reps = 50000;
        for(int i = 0; i < reps; i++) {
            // reps is the number of repetitions
            // declare reps as something large e.g. 50000
            list.get(random.nextInt(listSize)); // list is your list
            // (ArrayList or LinkedList)
        }
    }

}
