public class Main {
  public static void main(String[] args) {

  }
  public static int countRemains(BinTreeNode<Integer> node, int remain) {
    if (node == null) return 0;
    
    if (node.getValue() % 3 == remain) {
      int left = node.getLeft() != null ? countRemains(node.getLeft(), remain) : 0;
      int right = node.getRight() != null ? countRemains(node.getRight(), remain) : 0;
      
      return 1 + left + right;
    }

    int left = node.getLeft() != null ? countRemains(node.getLeft(), remain) : 0;
    int right = node.getRight() != null ? countRemains(node.getRight(), remain) : 0;
    
    return left + right;
  }
  public static boolean treeEqual(BinTreeNode<Integer> node) {
    int remain0 = countRemains(node, 0);
    int remain1 = countRemains(node, 1);
    int remain2 = countRemains(node, 2);
    
    return remain0 == remain1 && remain1 == remain2;
  }
}
