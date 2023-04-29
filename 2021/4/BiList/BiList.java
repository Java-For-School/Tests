package BiList;

public class BiList {
  private Node<Integer> lst1;
  private Node<Integer> lst2;

  public BiList() {
    lst1 = new Node<Integer>();
    lst2 = new Node<Integer>();
  }

  public void addNum(int num, int codeList) {
    Node<Integer> temp;

    if (codeList == 1) {
      temp = this.lst1;
      while (temp.getNext() != null) temp = temp.getNext();
      temp.setNext(new Node<Integer>(num));
    }
    else if (codeList == 2) {
      temp = this.lst2;
      while (temp.getNext() != null) temp = temp.getNext();
      temp.setNext(new Node<Integer>(num));
    }
  }
}
