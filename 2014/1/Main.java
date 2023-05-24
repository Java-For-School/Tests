public class Main {
  public static int getTreeHeight(BinNode<Integer> node, int height) {
    if (node == null) return height; 
    return Math.max(getTreeHeight(node.getLeft(), height + 1), getTreeHeight(node.getRight(), height + 1));
  }
  public static int getTreeHeight(BinNode<Integer> node) {
    return getTreeHeight(node, 0);
  } 
  public static boolean isBalanced(BinNode<Integer> node) {
    if (node ==  null) return true;

    boolean balanced = Math.abs(getTreeHeight(node.getLeft()) - getTreeHeight(node.getRight())) <= 1;
    if (!balanced) return false;

    return isBalanced(node.getLeft()) && isBalanced(node.getRight());
  }
}
