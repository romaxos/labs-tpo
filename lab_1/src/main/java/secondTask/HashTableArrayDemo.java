package secondTask;

import java.util.Hashtable;

public class HashTableArrayDemo {
    public static void main(String[] args) {
        HashTableArray<String> hm = new HashTableArray<String>(10);
        Hashtable<String, String> fe = new Hashtable<>();
        fe.put("wd", "d");
        System.out.println(fe.toString());
        hm.put("a", "hussein");
        hm.put("b", "jema");
        hm.put("c", "laya");
        System.out.println(hm.toString());
    }
}
