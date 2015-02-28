package project2;

/**
 * Provides the methods for a stack of Card objects.
 */
public abstract class Stack implements Stackable {

  private int maxSize;
  private int top = -1;
  private Card[] stack; // Link it to the deck of cards

  public Stack (int size) {
      maxSize = size;
      stack = new Card[maxSize]; //should be stack[maxSize] rather than int[maxSize]?
  }

  /**
   * Determines if the stack is empty.
   * @return True if the stack is empty; otherwise, false.
   */
  public boolean isEmpty() {
      return top == -1;
  }

  /**
   * Determines if the stack is full.
   * @return True if the stack is full; otherwise, false.
   */
  public boolean isFull() {
      return top == maxSize - 1;
  }
  /**
   * Removes a Card object from the top of the stack.
   * @return The Card object that was removed.
   */
  public Card pop()   {
    while (!isEmpty()) { // Calling isEmpty() prevents outOfBounds Exception
      
    }
    return stack[top--];
  }


  /**
   * Adds a Card object to the top of the stack.
   * @param card The Card object to add.
   */
  public void push(Card card) {
    while (!isFull()) { // Calling isFull() prevents outOfBounds Exception
      stack[top++] = card;
    }
  }



    /**
     * Displays the Card objects stored in the stack.
     * Hint: Start at the top and work your way down to 0.
     */
    @Override
    public void displayStack() {
        System.out.print("\nDeck: ");
        for(int x = top; x >= 0; x--) {
            System.out.format("%s ", stack[x]);
        }
        System.out.println();
    }
}
