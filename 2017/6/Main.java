public class Main {
  public static void main(String[] args) {

  }
  public static boolean exist(BinNode<Integer> t, int x) {
    if (t == null) return false;
    if (t.getValue() == x) return true;
    
    return exist(t.getLeft(), x) || exist(t.getRight(), x);
  }

  public static Node<Integer> check(BinNode<Integer> t1, BinNode<Integer> t2, Node<Integer> list) {
    if (t1 == null) return list;
    if (!exist(t2, t1.getValue())) {
      list = new Node<Integer>(t.getValue(), list);
    }

    list = check(t1.getLeft(), t2, list);
    list = check(t1.getRight(), t2, list);
    
    return list;
  }
}
