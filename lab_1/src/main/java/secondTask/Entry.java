package secondTask;


public class Entry {
    String key;            // Ключ
    Object value;       // то, что будет храниться (object, потому что не ебем какой тип)
    Entry next;


    public Entry(String key, Object value) {
        this.key = key;
        this.value = value;
        next = null;
    }

    /* типо в самом начале при инициализации */
    public Entry() {
        next = null;
    }

    public String GetKey() {
        return this.key;
    }

    public Object GetValue() {
        return value;
    }
}
