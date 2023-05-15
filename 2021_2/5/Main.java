public class Main {
  public static void main(String[] args) {

  }
  public static boolean isPrefix(Node<Integer> list1, Node<Integer> list2) {
    Node<Integer> temp1 = list1;
    Node<Integer> temp2 = list2;

    while (temp1 != null) {
      if (temp2 == null) return false;
      if (temp1.getValue() != temp2.getValue()) return false;
      
      temp1 = temp1.getNext();
      temp2 = temp2.getNext();
    }

    return true;
  }
  public static boolean isSubChain(Node<Integer> list1, Node<Integer> list2) {
    Node<Integer> temp = list2;

    while (temp != null) {
      if (isPrefix(list1, temp)) return true;
      temp = temp.getNext();
    }

    return false;
  }
}
