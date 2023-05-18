public class Main {
  public static void main(String[] args) {
    
  }
  public static boolean order(BinTreeNode<Range> node) {
    if (node == null) return true;
    
    if (node.getLeft() != null) {
      if (node.getLeft().getValue().getLow() != node.getValue().getLow()) return false;
      if (node.getLeft().getValue().getHigh() > node.getValue().getHigh()) return false;
    }
    if (node.getRight() != null) {
      if (node.getRight().getValue().getHigh()!= node.getValue().getHigh()) return false;
      if (node.getRight().getValue().getLow() < node.getValue().getLow()) return false;
    }
     
    if (node.getRight() != null && node.getLeft() != null) {
      if (node.getLeft().getValue().getHigh() >= node.getRight().getValue().getLow()) return false;
    }
    return order(node.getLeft()) && order(node.getRight());
  }
}
