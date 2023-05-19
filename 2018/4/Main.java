public class Main {
  public static void main(String[] args) {

  }
  public static int lastAndRemove(Queue<Integer> queue) {
    Queue<Integer> temp = new Queue<Integer>();

    int element = queue.remove();

    while (!queue.isEmpty()) {
      temp.insert(element);
      element = queue.remove();
    }

    while (!temp.isEmpty()) queue.insert(temp.remove());

    return element;
  }
  public static Queue<TwoItems> stackTwoItems(Queue<Integer> queue) {
    // cannot be done solely with queues and hence is unneeded for this test
  }
}
