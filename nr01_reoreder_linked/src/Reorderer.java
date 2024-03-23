import java.util.LinkedList;

public class Reorderer {

    //reorder (reverse) second half of the list
    public void reorderList(LinkedList<String> list) {

        var elementsToReorder = list.size()/2;
        var reordered = new String[elementsToReorder];
        var iter = list.listIterator(list.size()-1);
        
        //move the iterator: XXXXX|X -> XXXXXX|
        iter.next();
        
        //fill the array in the reversed order and move the iterator: XXXXXX| -> XXX|XXX
        for (int i=0; i<reordered.length; i++) {
            reordered[i] = iter.previous();
        }

        //add elements from the array to the list  where the iterator is
        for (int i=0; i<reordered.length; i++) {
            iter.add(reordered[i]);
        }

        //remove last elements (which are in wrong order)
        for (int i=0; i<reordered.length; i++) {
            list.removeLast();
        }
    }
}