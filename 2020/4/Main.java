public class Main {
  public static void main(String[] args) {

  }
  public static boolean isExist(int number, Queue<Integer> queue) {
    Queue<Integer> temp = new Queue<Integer>();
    boolean exists = false;
    while (!queue.isEmpty()) {
      int element = queue.remove();
      if (element % 10 == num) exists = true;
      temp.insert(element);
    }
    while (!temp.isEmpty()) queue.insert(temp.remove());
    return exists;
  }
  public static Queue<Integer> clone(Queue<Integer> queue) {
    // ...
  }
  public static boolean allExists(Queue<Integer> queue) {
    Queue<Integer> clone = this.clone(queue);
    Queue<Integer> temp = new Queue<Integer>();
    boolean exists = true;
    
    while (!queue.isEmpty()) {
      int element = queue.remove();
      int n = element;
      while (n / 10 > 0) n /= 10;
      if (this.isExist(n, clone) == false) exists = false;
      temp.insert(element);
    }
    while (!temp.isEmpty()) queue.insert(temp.remove());
    
    return exists;

  } 
}
