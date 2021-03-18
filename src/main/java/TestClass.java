import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass {

    public static void EvenOrOdd(){
        System.out.println("******Even and Odd using filter() and demonstrating count() to know number of elements****");
        List<Integer> integers = Arrays.asList(1,  35, 39, 42, 50, 55, 58, 63, 70);
        List<Integer> evenOrOdd = integers.stream().filter(i -> i%2==0).collect(Collectors.toList());
        System.out.println("Even number from 1-70 is:"+evenOrOdd+"\nintegers Stream has "+integers.stream().count()+" "+"elements");

    }

    public void streamMethods(){
        System.out.println("*****Sorting List using sorted()*****");
        List<String> stringList = Arrays.asList("Rehash","ram","adarsh","bhanu","Chandal","Ramesh","mahendra","nilesh");
        List<String > sortingAndFilter = stringList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortingAndFilter);

        System.out.println("*****Customized  sorting by passing comparator object******");
        List<String> strings = Arrays.asList("A","B","C","D","F","G","Z");
        List<String> customizedSorting = strings.stream().sorted((s1,s2) ->s2.compareTo(s1)).collect(Collectors.toList());
        System.out.println(customizedSorting);

        System.out.println("*****norma way te get square root by  map()*****");
        List<Integer> integers = Arrays.asList(5,2,6);
        List<Integer> list = integers.stream().map(integer -> integer*integer).collect(Collectors.toList());
        System.out.println(list);

        System.out.println("*****square root by map() and Using forEach() of stream  to iterate*****");
        List<Integer> square_Root = Arrays.asList(5,10);
        square_Root.stream().map(integer -> integer*integer).forEach(System.out::println);
       // square_Root.stream().map(integer -> integer*integer).forEach(integer -> System.out.println(integer));



    }
}
