package 7;

public class Main {
  public static void main(String[] args) {

  }
  public static wordFromRoot(BinNode<Character> tree, String str) {
    if (str.length() == 0) return true;
    if (tree == null) return false;
    if (tree.getValue() == str.chartAt(0)) {
      String newString = eraseFirst(str);
      if (newString.length() == 0) return true;
      return wordFromRoot(tree.getLeft(), eraseFirst(str)) || wordFromRoot(tree.getRight eraseFirst(str));  
    }
    return false;
  }
}
