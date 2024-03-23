public class Main {
    
    public static void main(String[] args) throws Exception {
        
        int[] numbers = {1,5,4,3,9,8,7,6,5};

        var MergeSorter = new MergeSorter();
        MergeSorter.sortNumbers(numbers);
        
        //print result
        for (int i = 0; i<numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
