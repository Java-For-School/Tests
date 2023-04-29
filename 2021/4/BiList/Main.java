package BiList;

public class Main {
  public static void main(String[] args) {

  }
  private static Node<Integer> delete (int num, Node<Integer> lst) {
    Node<Integer> temp = lst;

    while (temp != null) {
      if (temp.getValue() == num) return temp.getNext(); 
      if (temp.getNext().getValue() == num) temp.setNext(temp.getNext().getNext());
    }

    return lst;
  }
  private static BiList generateBiList(Node<Integer> lst) {
    BiList biList = new BiList();
    Node<Integer> temp = lst;
    
    int length = 0;
    
    while (temp != null) {
      length++;
      temp = temp.getNext();
    } 
    
    for (int i = 0; i < length / 2; i++) {
      temp = lst;
      int largest = temp.getValue();

      while (temp != null) {
        if (temp.getValue() > largest) largest = temp.getValue();
        temp = temp.getNext();
      }
      
      biList.addNum(largest, 1);
      lst = delete(largest, lst);
    }
    for (int i = 0; i < length / 2; i++) {
      while (temp != null) {
        biList.addNum(temp.getValue(), 2);
        temp = temp.getNext();
      }
    }
    return biList;
  }
}
