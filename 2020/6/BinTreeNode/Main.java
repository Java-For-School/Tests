package BinTreeNode;

public class Main {
  public static void main(String[] args) {
    BinTreeNode<Integer> first = new BinTreeNode(2);
    BinTreeNode<Integer> sFirst = new BinTreeNode(1);
    BinTreeNode<Integer> sSecond = new BinTreeNode(6);
    BinTreeNode<Integer> tFirstFirst = new BinTreeNode(6);
    BinTreeNode<Integer> tFirstSecond = new BinTreeNode(6);
    
    sFirst.setLeft(tFirstFirst);
    sFirst.setRight(tFirstSecond);
  
    first.setLeft(sFirst);
    first.setRight(sSecond);

    printAll(first);
  }
  private static void printAll(BinTreeNode<Integer> node) {
    printAll(node, ""); 
  }
  private static void printAll(BinTreeNode<Integer> node, String number) {
    if (node == null) System.out.println(number);
    if (!node.hasLeft() && !node.hasRight()) { 
      System.out.println(number + node.getValue());
    }
    else {
      if (node.hasLeft()) printAll(node.getLeft(), number + node.getValue());
      if (node.hasRight()) printAll(node.getRight(), number + node.getValue());
    }
  }
}
