package secondTask;

public class HashTableArray {
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

    // функция генерации Хэша
    int GetHash(String key) {
        return key.hashCode() % size;
    }


    // положить элемент в хэш таблицу
    public void put(String key, String value) {
        int HashIndex = GetHash(key);
        Entry ArrayValue = arrayHash[HashIndex];
        Entry newItem = new Entry(key,value);
        newItem.setNext(ArrayValue.getNext());
        ArrayValue.setNext(newItem);
    }


    // получить элемент из хэш таблицы по его ключу
    public String get(String key) {
        String value = null;
        int HashIndex = GetHash(key);
        Entry ArrayValue = arrayHash[HashIndex];
        while (ArrayValue != null) {
            if (ArrayValue.getKey() != null) {
                if (ArrayValue.getKey().equals(key)) {
                    value = ArrayValue.getValue();
                    break;
                }
            }
            ArrayValue = ArrayValue.getNext();
        }
        return value;
    }

    // функция удаления
    public String remove(String key) {
        String value = null;
        int HashIndex = GetHash(key);
        Entry lastElement = arrayHash[HashIndex];
        Entry currentElement = arrayHash[HashIndex];
        while (currentElement != null) {
            if (currentElement.getKey() != null && currentElement.getKey().equals(key)) {
                value = currentElement.getValue();
                lastElement.setNext(currentElement.getNext());
                break;
            }
            lastElement = currentElement;
            currentElement = currentElement.getNext();
        }
        return value;
    }

    public StringBuilder myToString() {
        StringBuilder res = new StringBuilder("{");
        Entry current;
        for (int i = 0; i < size; i++) {
            current = arrayHash[i];
            while (current != null) {
                if (current.getKey() != null) {
                    res.append(String.join("=", current.getKey(), current.getValue())).append(", ");
                }
                current = current.getNext();
            }
        }
        if (!(res.toString().equals("{"))) {
            int lenString = res.length();
            res.delete(lenString - 2, lenString);
        }
        res.append("}");

        return res;
    }




}
