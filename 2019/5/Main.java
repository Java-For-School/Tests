public class Main {
  public static void main(String[] args) {

  }
  public static int toNumber(Queue<Integer> queue) {
    int number = 0;
    int numberLength = 0;

    while (!queue.isEmpty()) {
      int element = queue.remove();
      number += (Math.pow(10, numberLength) * element);
      numberLength++;
    }

    return number;
  }
  public static int bigNumber(Node<Queue<Integer>> node) {
    int max = 0;    

    while (node != null) {
      int number = toNumber(node.getValue());
      if (max < number) max = number;
    }

    return max;
  }
}
