package Node;

public class Main {
  public static void main(String[] args) {

  }
  private static int getSize(Node<Integer> node) {
    int count = 0;
    
    while (node != null) {
      count++
      node = node.getNext();
    }
    return count;
  }
  private static Node<Integer> move(Node<Integer> node, int n) {
    Node<Integer> temp = node;
    Node<Integer> trailingNode;
    
    int length = getSize(node);
    
    for (int i = 1; i < length - n; i++) temp = temp.getNext();

    trailingNode = temp.getNext();
    temp.setNext(null);
    temp = trailingNode; 
    while (temp.getNext() != null) temp = temp.getNext();
    temp.setNext(node);

    return trailingNode;
  }
}
