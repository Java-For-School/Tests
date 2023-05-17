public class Main {
  public static void main(String[] args) {

  }
  public static int exact(String[] arr, int num) {
    int sum = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i].length() == num) sum++;
    }

    return sum;
  }
}
