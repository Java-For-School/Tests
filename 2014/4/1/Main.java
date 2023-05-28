public class Main {
  public static void main(String[] args) {

  }
  public static int what(Node<Integer> list) {
    if (list == null) return 0;
    int x = list.getValue();
    list = list.getNext();
    if (x >= 0) return what(list);

    return 1 + what(list); // Counts the number of elements that are negative
  }
}
