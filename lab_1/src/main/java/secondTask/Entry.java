package secondTask;


public class Entry {
    private String key;
    private String value;
    private Entry next;


    public Entry() {
        next = null;
    }

    public Entry(String key, String value) {
        this.key = key;
        this.value = value;
        next = null;
    }


    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public void setNext(Entry next) {
        this.next = next;
    }

    public Entry getNext() {
        return next;
    }
}
