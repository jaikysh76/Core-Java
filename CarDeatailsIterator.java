import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
// Import the ArrayList class and the Iterator class
public class CarDeatailsIterator {
    public static void main(String[] args) {
        // make a collection
        ArrayList<String> cars= new ArrayList<String>();
        cars.add("Volvo");
        cars.add("Maruti");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("skoda");

        //get the Iterator

        Iterator<String> it = cars.iterator();

        //print the first item
        System.out.println(it.next());
    }
}
