import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class LFUCache<T> {

    private HashMap bykey;
    private FrequencyNode head;
    private List<FrequencyNode> accesses;

    public LFUCache() {
        bykey = new HashMap<>();
        head = new FrequencyNode();
        accesses = new LinkedList<>();
        accesses.add(0, head);
    }

    protected FrequencyNode getNewNode(T data) {
        FrequencyNode newNode =  new FrequencyNode();
        newNode.setNext(null);
        newNode.setPrev(head);
        return newNode;
    }
}
