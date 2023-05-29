public class Main {
  public Node<Integer> append(Node<Integer> node, int element) {
    Node<Integer> temp = node;

    while (temp.getNext() != null) {
      temp = temp.getNext();
    }

    temp.setNext(new Node(element));
  }
  public boolean isInList(Node<Integer> node, int element) {
    Node<Integer> temp = node;
    boolean found = false;

    while (temp != null) {
      if (temp.getValue() == element) found = true;
    }

    return found;
  }
  public Node<Integer> getNumbers(Node<Integer> node, int num) {
    Node<Integer> newNumbers = new Node(0);
    Node<Integer> temp = node;
    
    for (int i = 1; i < num; i++) {
      if (!isInList(node, i)) append(newNumbers, i);
    }

    return newNumbers.getNext();
  }
}
