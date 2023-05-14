package BinTreeNode;

public class BinTreeNode<T>
{
    private T value;
    private BinTreeNode<T> left;
    private BinTreeNode<T> right;
    public BinTreeNode(T value)
    {
        this.value = value;
        this.left = null;
        this.right = null;
    }
    public BinTreeNode(BinTreeNode<T> left, T value, BinTreeNode<T> right)
    {
        this.value = value;
        this.left = left;
        this.right = right;
    }
    public T getValue()
    {
        return value;
    }
    public BinTreeNode<T> getLeft()
    {
        return left;
    }
    public BinTreeNode<T> getRight()
    {
        return right;
    }
    public void setValue(T value)
    {
        this.value = value;
    }
    public void setLeft(BinTreeNode<T> left)
    {
        this.left = left;
    }
    public void setRight(BinTreeNode<T> right)
    {
        this.right = right;
    }
    public boolean hasLeft() {
      return this.getLeft() != null;
    }
    public boolean hasRight() {
      return this.getRight() != null;
    }
    public String ToString()
    {
        return " ( " + left + " " + value + " " + right + " ) ";
    }
}
