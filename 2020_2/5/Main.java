// Queue instead of Stack as Stacks are not part of the upcoming test

public class Main {
  public static void main(String[] args) {

  }
  public static Queue<Integer> removeDuplicates(Queue<Integer> queue) {
    Queue<Integer> newQueue = new Queue<Integer>();
    if (queue.isEmpty()) return queue;
    
    while (!queue.isEmpty()) {
      int element = queue.remove();
      int nextElement = queue.head();

      if (element == nextElement) {
        while (queue.head() == element) queue.remove();
      }
      else {
        newQueue.insert(element);
      }
    }

    return newQueue;
  }
}
