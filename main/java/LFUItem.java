public class LFUItem<T> {
    private T data;
    private FrequencyNode parent;

    public LFUItem(T data, FrequencyNode parent) {
        this.data = data;
        this.parent = parent;
    }
}
