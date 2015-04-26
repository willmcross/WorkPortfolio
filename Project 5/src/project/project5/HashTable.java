package project.project5;

/**
 * Project.java - Executes driver, etc.
 */

public class HashTable implements Hashable {

    Node[] hashtable;
    private final String HEADER = String.format("%-15s %-15s %-15s %-15s %-15s %-15s", "State:", "Capital:", "Abbreviation:", "Population:",
            "Region:", "Region #:");

    public HashTable(int size) {
        hashtable = new Node[size];
    }

    /**
     * Displays the items stored in the hash table.
     *
     * @param ascending True if items ordered from smallest to largest;
     * otherwise, from largest to smallest.
     */
    public void display() {
        Node temp = null;
        for (int i = 0; i < hashtable.length; i++) {
            System.out.println("Index: " + i);
            System.out.println(HEADER);
            temp = hashtable[i];
            while (temp != null) {
                System.out.println(temp.getState().toString());
                temp = temp.getNext();
            }
            System.out.println();
        }
    }

    /**
     * Determines the hash index based on the input value (a state name).
     *
     * The hash function MUST meet the following requirements: - Calculate the
     * sum of all the character values in the state name (i.e., A = 65, B = 66,
     * etc.) - Calculate the modulus of this sum using the size of the hash
     * table array (i.e., sum % 10)
     *
     * @param value The value to calculate the hash index.
     * @return the hash index based on the input value.
     */
    public int getHash(String value) {
        int hash = 0;
        int asciiSum = 0;
        for (int i = 0; i < value.length(); i++) {
            asciiSum += value.charAt(i);
        }
        hash = asciiSum % 10;
        return hash;
    }

    /**
     * Adds an item to the appropriate location of the hash table.
     *
     * @param state The State object to add.
     */
    public void insert(State state) {
        Node item = new Node(state);
        int hash = getHash(state.getName());
        Node temp = hashtable[hash];

        if (isEmpty(hash)) {
            hashtable[hash] = item;
        } else if (item.getState().getName().compareToIgnoreCase(temp.getState().getName()) < 0) {
            item.setNext(temp);
            hashtable[hash] = item;
        } else {
            while (temp.getNext() != null && item.getState().getName().compareToIgnoreCase(temp.getNext().getState().getName()) >= 0) {
                temp = temp.getNext();
            }
            item.setNext(temp.getNext());
            temp.setNext(item);
        }
    }

    /**
     * Determines if the specified index of the hash table is empty.
     *
     * @param index The index of the hash table to test.
     * @return True if the specified index of the hash table is empty;
     * otherwise, false.
     */
    public boolean isEmpty(int index) {
        return hashtable[index] == null;
    }

    /**
     * Locates the specified state in the hash table.
     *
     * @param name The state name to find in the hash table.
     * @return A message indicating whether the state was found in the hash
     * table, and the hash and position of the state, if found.
     */
    public String findState(String name) {
        int hash = getHash(name);
        int index = 0;
        boolean foundState = false;
        Node temp = hashtable[hash];
        String message = "";

        while (temp != null && foundState == false) {
            if (name.compareToIgnoreCase(temp.getState().getName()) == 0) {
                foundState = true;
            } else {
                temp = temp.getNext();
                index++;
            }
        }

        if (foundState == true) {
            if (name.indexOf("s") == name.length() - 1) { //tests whether the state's name ends with an "s".
                message = name + "' location is hash: " + hash + " Position: " + index;
            } else { //if the state's name did not end in "s".
                message = name + "'s location is hash: " + hash + " Position: " + index;
            }
        } else {
            message = name + " was not found in the hash table.";
        }
        return message;
    }

    /**
     * Removes the next State object from the hash table.
     *
     * @return The State object that was removed.
     */
    public State remove() {
        State removal = null;
        return removal;
    }
}
