public class Main {
  public static void amir(BinTreeNode<Integer> t, int x) {
    if (t != null) {
      amir(t.getLeft(), x + 1);
      if ((t.getLeft() == null) && (t.getRight() == null)) t.setValue(x);
      amir(t.getRight(), x + 1);
    }
  }
}
