import java.util.Random;

public class Main {
  public static void main(String[] args) {

  }
  public static int[] getGoodPair() {
    Random random = new Random();
    boolean hasFound = false;
    int num1, num2;

    while (!hasFound) {
      int random1 = 1 + random.nextInt(1000);
      int random2 = 1 + random.nextInt(1000);
      num1 = random1;
      num2 = random2;

      int first_b = random1 % 10;
      temp = random1;
      while (temp / 10 > 0) temp /= 10;
      int first_e = temp;
      
      int second_b = random2 % 10;
      temp = random2;
      while (temp / 10 > 0) temp /= 10;
      int second_e = temp;


      if (first_b == second_e || first_e == second_b) hasFound = true;
    }
    int result[] = { num1, num2 };
    return result;

  }
  public static PairOfNums[] generate(int n) {
    PairOfNums[] arr = new PairOfNums[n];
    int temp;

    for (int i = 0; i < n; i++) {
      int[] result = getGoodPair();
      arr[i] = new PairOfNums(result[0], result[1]);
    }

  }
}
