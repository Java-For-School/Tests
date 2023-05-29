public class Main {
  public static void main(String[] args) {

  }
  // Returns true if both lists are of at least 4 elements, and that the first and fourth elements of list1 are equal to the first element of list2 and false otherwise 
  public static boolean sod1(Node<Integer> list1, Node<Integer> list2) {
    Node<Integer> node1 = list1;
    Node<Integer> node2 = list2;

    for (int i = 1; i <= 4; i++) {
      if ((node1 == null) || (node2 == null)) return false;

      if ((i == 1) || (i == 4)) {
        if (node1.getValue() != node2.getValue()) return false;
      }
      node1 = node1.getNext();
    }

    return true;
  }
  // Returns true if the lists are of identical elements. (correspondingly*) and false otherwise
  public static boolean sod2(Node<Integer> list1, Node<Integer> list2) {
    Node<Integer> node1 = list1;
    Node<Integer> node2 = list2;

    while ((node1 != null) && (node2 != null)) {
      if (node1.getValue() != node2.getValue()) return false;
      node1 = node1.getNext();
      node2 = node2.getNext();
    }

    return true;
  }
  // Returns true if list2 includes every single elements present in list 1 and false otherwise 
  public static boolean sod3(Node<Integer> list1, Node<Integer> list2) {
    Node<Integer> node1 = list1;

    while (node1 != null) {
      boolean found = false;
      Node<Integer> node2 = list2;

      while ((node2 != null) && (!found)) {
        if (node1.getValue() == node2.getValue()) found = true;
        node2 = node2.getNext();
      }

      if (!found) return false;
      node1 = node1.getNext();
    }

    return true;
  }
}
