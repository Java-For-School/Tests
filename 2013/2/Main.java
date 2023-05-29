public class Main {
  public static int big(TriTreeNode<Integer> node) {
    if (node == null) return -1;
    if (node.getLeft() == null && node.getRight() == null && node.getMiddle() == null) return node.getValue();

    return Math.max(Math.max(Math.max(big(node.getLeft), big(node.getRight())), big(node.getMiddle())), node.getValue());
  }
  public static int noThree(TriTreeNode<Integer> node) {
    if (node == null) return true;
    if (node.getRight() != null && node.getLeft() != null && node.getMiddle() != null) return false;
    return noThree(node.getLeft()) && noThree(node.getRight()) && noThree(node.getMiddle());
  }
}
