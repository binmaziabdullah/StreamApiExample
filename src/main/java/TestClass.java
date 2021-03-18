import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

        /*Stream is used to process the collection of object or collection over iteration
        * we can call or create stream on collection Object
        * Stream makes the code concise & readable which is the main advantage of stream
        * Stream Api has the methods such as filter,map,collect etc
        * filter is the method which execute based on the condition and simplifies to check condition
        * and if you want to perform operation on objects then u should use map()*/
public class TestClass {
    public static String EvenOrOdd(){
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1, 5, 8, 9, 12, 13, 15, 16, 20, 26, 28, 35, 39, 42, 50, 55, 58, 63, 70));
        List<Integer> l =  al.stream().filter(integer -> integer % 2 == 0).collect(Collectors.toList());
        return "even number from 1 to 70 is:" + l;

    }
    
}
