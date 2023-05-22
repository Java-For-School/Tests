public class Main {
  public static boolean isTriangular(Node<Integer> node) {
    Node<Integer> temp = node;
    Node<Integer> second = node;
    int length = 0;

    while (temp != null) {
      length++;
      temp = temp.getNext();
    }

    if (length % 3 != 0) return false;
    
    temp = node;
   
    for (int i = 0; i < length / 3; i++) {
      second = second.getNext();
    }

    for (int i = 0; i < length / 3 * 2; i++) {
      temp = temp.getNext();
    }

    for (int i = 0; i < length / 3; i++) {
      if (node.getValue() != second.getValue() || second.getValue() != temp.getValue()) return false;
      node = node.getNext();
      second = second.getNext();
      temp = temp.getNext();
    }

    return true;
  }
}
