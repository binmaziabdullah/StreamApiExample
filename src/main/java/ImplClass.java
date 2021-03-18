class ImplClass {

    /*Stream is used to process the collection of object or collection over iteration
     Stream is the sequence of object which have useful methods to perform the certain operation and get the desired ouputs
     * we can call or create stream on collection Object
     * Stream makes the code concise & readable which is the main advantage of stream
     * Stream Api has the methods such as filter,map,collect etc
     * filter(predicate) is the method which execute based on the condition and simplifies to check condition b'coz it was boolean
     * and if you want to perform operation on objects then u should use map() bcoz it's taking function as argument
     sorted() method used to sort the stream by default it has enable default nature of sorting(Ascending) and
     if you want to customize the sorting then u can pass the comparator object as argument
     count() method returns the number of element present in the stream
     forEach() method is used to iterate the stream
     collect() method is return the result of all intermediate operations apart from that it has its own method such as groupBy()
     ,toList(),summingInt() etc*
     ---------------------------------
     /
     */
    public static void main(String[] args) {
        EvenOdd evenOdd = TestClass::EvenOrOdd;
        evenOdd.evenOdd();

        new TestClass().streamMethods();






    }

}
