public class Main {
  public static void main(String[] args) {

  }
  public static boolean upPath(BinNode<Integer> tr) {
    if (tr == null) return false;
    if (tr.getLeft() == null && tr.getRight() == null) return true; 
    if (tr.getValue() > tr.getLeft().getValue() && tr.getValue() > tr.getRight().getValue()) return false;
    
    return (tr.hasLeft() && upPath(tr.getLeft())) || (tr.hasRight() && upPath(tr.getRight()));
  }
}
