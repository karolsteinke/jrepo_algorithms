import java.util.LinkedList;

public class Main {
    
    public static void main(String[] args) throws Exception {
        
        var list = new LinkedList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");

        var reorderer = new Reorderer();
        reorderer.reorderList(list);
        System.out.println(list);

    }
}
