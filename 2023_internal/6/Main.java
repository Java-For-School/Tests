public class Main {
  public static int getSumDigits(int number) {
    int sum = 0;

    while (number != 0) {
      sum += number % 10;
      number /= 10;
    }

    return sum;
  }  
  public static boolean twinNums(int num1, int num2) {
    return getSumDigits(num1) == getSumDigits(num2);
  }
  public static boolean isInQueue(Queue<Integer> queue, int number) {
    Queue<Integer> temp = new Queue<Integer>();
    boolean found = false;

    while (!queue.isEmpty()) {
      int element = queue.remove();
      if (number == element) found = true;
      temp.insert(element);
    }

    while (!temp.isEmpty()) queue.insert(temp.remove());

    return found;
  }
  public static boolean hasTwinInQueue(Queue<Integer> queue, int number) {
    Queue<Integer> temp = new Queue<Integer>();
    boolean found = false;

    while (!queue.isEmpty()) {
      int element = queue.remove();
      if (twinNums(element, number)) found = true;
      temp.insert(element);
    }

    while (!temp.isEmpty()) queue.insert(temp.remove());

    return found;
  }
  public static int getQueueLength(Queue<Integer> queue) {
    Queue<Integer> temp = new Queue<Integer>();
    int length = 0;

    while (!queue.isEmpty()) {
      int element = queue.remove();
      temp.insert(element);
      length++;
    }

    while (!temp.isEmpty()) queue.insert(temp.remove());

    return length;
  }
  public static int getNumOfGroups(Queue<Integer> queue) {
    Queue<Integer> groups = new Queue<Integer>(); 

    while (!queue.isEmpty()) {
      int element = queue.remove();
      if (hasTwinInQueue(queue, element)) {
        int sumOfDigits =  getSumDigits(element);
        if (!isInQueue(groups, sumOfDigits)) {
          groups.insert(sumOfDigits);
        }
      }
    }

    return getQueueLength(groups);
  }
}
