package Source.demo.src.com.example;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ArrayList<Integer> sortMe = new ArrayList<Integer>();
        Sorts sorter = new Sorts();
        sortMe.add(3);
        sortMe.add(2);
        sortMe.add(5);
        sortMe.add(1);
        sortMe.add(4);

        System.out.println("Prior to sort:");
        System.out.println(sortMe.toString());
        //Sorts
        //sorter.quickSortStart(sortMe);
        sorter.mergeSortStart(sortMe);

        System.out.println("After sort:");
        System.out.println(sortMe.toString());
    }

}
