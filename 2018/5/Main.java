public class Main {
  public static void main(String[] args) {

  }
  public static boolean hasAB(Node<Integer> node) {
    Node<Integer> newNode = node;

    while (newNode != null) {
      newNode = Sod1(newNode, 'a');
      if (newNode != null) {
        if (newNode.getNext().getValue() == 'b') return true;
      }
    } 
    while (newNode != null) {
      newNode = Sod1(newNode, 'b');
      if (newNode != null) {
        if (node.getNext().getValue() == 'a') return true;
      }
    }

    return false;
  }
}
