
public class TelephoneStorage {

    private Person[] storage;

    public void add(Person p) {

        if (storage == null) {

            storage = new Person[1];
            storage[0] = p;
        } else {

            int currentCount = storage.length;

            Person[] newStorage = new Person[currentCount + 1];

            for (int i = 0; i < storage.length; i++)
                newStorage[i] = storage[i];

            newStorage[newStorage.length - 1] = p;
            storage = newStorage;
        }
    }

    public void print() {

        Utils.println("****************************************");

        if(storage == null) {

            Utils.println("Empty storage...");
        } else {

            for(Person p : storage)
                Utils.println(
                    String.format("[%d]%s", find(p), p));
        }

        Utils.println("****************************************");
    }

    public int find(Person p) {

        for (int i = 0; i < storage.length; i++) {
            if (p.equals(storage[i]))
                return i;
        }

        return -1;
    }

}
