package secondTask;

import java.util.Hashtable;

public class HashTableArrayDemo {
    public static void main(String[] args) {
        HashTableArray<String> hm = new HashTableArray<String>(10);
        hm.put("1", "roma");
        hm.put("2", "privet");
        hm.put("2", "privet");
        hm.put("3", "hello");
        hm.put("3", "lol");
        System.out.println(hm.get("2"));
        System.out.println(hm.remove("2"));
        System.out.println(hm.get("2"));
        System.out.println(hm.remove("2"));
        System.out.println(hm.get("2"));
    }
}
