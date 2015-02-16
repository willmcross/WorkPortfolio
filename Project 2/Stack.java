/**
 * Provides the methods for a stack of Card objects.
 */
public abstract class Stack implements Stackable {
    /**
     * Displays the Card objects stored in the stack.
     * Hint: Start at the top and work your way down to 0.
     */
    @Override
    public void displayStack() {
        System.out.print("\nDeck: ");
        for(int x = top; x >= 0; x--) {
            System.out.format("%s ", array[x]);
        }
        System.out.println();
    }
}
