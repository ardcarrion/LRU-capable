import java.util.HashMap;

public class FrequencyNode {
    private Integer value;
    private HashMap<Long, LFUItem> items;
    private FrequencyNode prev;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public HashMap<Long, LFUItem> getItems() {
        return items;
    }

    public void setItems(HashMap<Long, LFUItem> items) {
        this.items = items;
    }

    public FrequencyNode getPrev() {
        return prev;
    }

    public void setPrev(FrequencyNode prev) {
        this.prev = prev;
    }

    public FrequencyNode getNext() {
        return next;
    }

    public void setNext(FrequencyNode next) {
        this.next = next;
    }

    private FrequencyNode next;

    protected FrequencyNode() {
        value = 0;
        items = new HashMap<>();
        prev = this;
        next = this;
    }



}