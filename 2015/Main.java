public class Main {
  public static boolean evaluateTree(BinNode<Integer> node) {
    if (node == null) return false;
    if (node.getValue().equals("T")) return true;
    if (node.getValue().equals("F") return false;
    if (node.getValue().equals("AND")) return evaluateTree(node.getLeft()) && evaluateTree(node.getRight());
    if (node.getValue().equals("OR")) return evaluateTree(node.getLeft()) || evaluateTree(node.getRight());
  }
}
