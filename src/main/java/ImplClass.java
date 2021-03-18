class ImplClass {
    public static void main(String[] args) {
        EvenOdd evenOdd = TestClass::EvenOrOdd;
        String result = evenOdd.evenOdd();
        System.out.println(result);


    }

}
