package secondTask;

import java.util.ArrayList;

public class HashTableArray<T> {
    Entry[] arrayHash;
    int size;

    /* инициализация хэш таблицы  */
    public HashTableArray(int size) {
        this.size = size;
        arrayHash = new Entry[size];
        for (int i = 0; i < size; i++) {
            arrayHash[i] = new Entry();
        }
    }


    int GetHash(String key) {
        return key.hashCode() % size;
    }

    public void put(String key, Object value) {
        int HashIndex = GetHash(key);
        Entry ArrayValue = arrayHash[HashIndex];
        Entry newItem = new Entry(key,value);
        newItem.next = ArrayValue.next;
        ArrayValue.next = newItem;
    }



    public T get(String key) {
        T value = null;
        int HashIndex = GetHash(key);
        Entry ArrayValue = arrayHash[HashIndex];
        while (ArrayValue != null) {
            if (ArrayValue.GetKey() != null) {
                if (ArrayValue.GetKey().equals(key)) {
                    value = (T) ArrayValue.GetValue();
                    break;
                }
            }
            ArrayValue = ArrayValue.next;
        }
        return value;
    }
}
