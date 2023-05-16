public class Main {
  public static void main(String[] args) {

  }
  public static buildDigit(Node<Integer> lst) {
    Node<Integer> newList = new Node<Integer>(0);
    Node<Integer> temp = newList;
    
    while (lst != null) {
      int element = lst.getValue();
      
      while (element > 0) {
        temp.setNext(new Node<Integer>(element % 10));
        temp = temp.getNext();
        element /= 10;
      }
      
      temp.setNext(new Node<Integer>(-9));
      temp = temp.getNext();
      lst = lst.getNext();
    }
    
    return newList.getNext();
  }
}
