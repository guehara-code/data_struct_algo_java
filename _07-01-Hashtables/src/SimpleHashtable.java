public class SimpleHashtable {
    private Employee[] hashtable;

    public SimpleHashtable() {
        hashtable = new Employee[10];
    }

    public void put(String key, Employee employee) {
        int hashKey = hashKey(key);
        if(hashtable[hashKey] != null) {
            System.out.println("Sorry, there's already an employee at position " + hashKey);
        } else {
            hashtable[hashKey] = employee;
        }
    }

    public Employee get(String key) {
        int hashKey = hashKey(key);
        return hashtable[hashKey];
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            System.out.println(hashtable[i]);
        }
    }
}
