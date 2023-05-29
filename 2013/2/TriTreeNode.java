class TriTreeNode<T> {
  private T value;
  private TriTreeNode<T> left;
  private TriTreeNode<T> right;
  private TriTreeNode<T> middle;

  public TriTreeNode(T x) {
    this.value = x;
    this.left = null;
    this.right = null;
    this.middle = null;
  }

  public TriTreeNode(TriTreeNode<T> left, TriTreeNode<T> right, TriTreeNode<T> middle, T x) {

    this.value = x;
    this.left = left;
    this.right = right;
    this.middle = middle;
  }

}
