public class Main {
  public static int getSumLeaves(BinNode<Integer> node) {
    if (node == null) return 0;
    if (node.getLeft() == null && node.getRight() == null) return node.getValue();

    return getSumLeaves(node.getLeft()) + getSumLeaves(node.getRight());
  }
  public static int getSumSurroundingExceptLeaves(BinNode<Integer> node) {
    BinNode<Integer> temp = node;
    int sum = 0;
    
    while (temp.getLeft() != null || temp.getRight() != null) {
      sum += temp;
      temp = temp.getLeft();
    }

    temp = node.getRight();

    while (temp.getLeft() != null || temp.getRight() != null) {
      sum += temp;
      temp = temp.getRight();
    }

    return sum;
  }  
  public static int getSumSurrounding(BinNode<Integer> node) {
    return getSumLeaves(node) + getSumSurroundingExceptLeaves(node);
  }
}
