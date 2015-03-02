
/**
 * Provides the methods for a stack of Card objects.
 */
public class Stack implements Stackable {

  private int maxSize = 52;
  private int top = -1;
  private Card[] stack; // Link it to the deck of cards

  public Stack (int size) {
      stack = new Card[size]; //should be stack[maxSize] rather than int[maxSize]?
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
    if (isEmpty() == false) { // Calling isEmpty() prevents outOfBounds Exception
      return stack[top--];    
    }
    else return null;
  }


  /**
   * Adds a Card object to the top of the stack.
   * @param card The Card object to add.
   */
  public void push(Card card) {
   // if (isFull() == true) { // Calling isFull() prevents outOfBounds Exception
      top++;
      stack[top] = card;

  //  }
  }
}
