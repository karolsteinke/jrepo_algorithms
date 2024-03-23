public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        recursiveTest(4);
    }

    public static void recursiveTest(int a) {
        
        if (a > 2) {
            System.out.println("Calling recursion");
            a--;
            recursiveTest(a);
        }
        
    }
}
