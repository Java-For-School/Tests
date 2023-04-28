package Range;

public class Main {
  public static void main(String[] args) {

  }
  public static boolean isIncluded(Node<Integer> list1, Node<Range> list2) {
    Node<Range> temp = list2;
    
    while (list1 != null || list2 != null) {
      while (!list2.getValue().isInRanged(list1.getValue())) list2 = list2.getNext();
      list1 = list1.getNext();
    }

    return list1 != null;
  }
}
