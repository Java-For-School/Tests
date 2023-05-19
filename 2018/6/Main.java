public class Main {
  public static void main(String[] args) {

  }
  public static boolean lessThanTree(BinNode <Integer> t, in x) {
    // returns true if all values of the tree are greater than t, returns false otherwise  
  }
  public static boolean treeLessThanTree(BinNode<Integer> t1, BinNode<Integer> t2) {
    if (t1 == null) return true;
    if (!lessThanTree(t2, t1.getValue())) return false;
    
    return treeLessThanTree(t1.getLeft(), t2) && treeLessThanTree(t1.getRight(), t2) ;
  } 
}
