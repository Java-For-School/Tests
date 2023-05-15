public class Main {
  public static void main(String[] args) {

  }
  public static void isArranged(Node<Integer> node) {
    Node<Integer> temp = node;
    int length = 0;
    int max = temp.getValue();
    int min;

    while (temp.hasNext()) {
      length++;
      temp = temp.getNext();
    }
    
    if (length % 2 == 1) return false;

    int halfLength = length / 2;

    temp = node;

    for (int i = 0; i < halfLength; i++) {
      if (temp.getValue() > max) max = temp.getValue();
      temp = temp.getNext();
    }
    min = temp.getValue();
    for (int i = 0; i < halfLength; i++) {
      if (temp.getValue() < min) min = temp.getValue();
      temp = temp.getNext();
    }

    return max < min;
  }
}
