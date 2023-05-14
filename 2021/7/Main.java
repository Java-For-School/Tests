public class Main {
  public static int size(Queue<Integer> queue) {
    Queue<Integer> temp = new Queue<Integer>();
    int length = 0;

    while (!queue.isEmpty()) {
      length++;
      tmep.insert(queue.remove());
    }
    while (!temp.isEmpty()) queue.insert(temp.remove());

    return length;
  }
  public static boolean isIdentical(Queue<Integer> q1, Queue<Integer> q2) {
    int size1 = size(q1);
    int size2 = size(q2);

    if (size1 != size2) return false;

    for (int i = 0; i < size1; i++) {
      int element1 = q1.remove();
      int element2 = q2.remove();

      if (element1 != element2) return false;

      q1.insert(element1);
      q2.insert(element2);
    }
  }
}
