import java.util.Scanner;

public class Stam {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] arr = new int[] {/*...*/};
    int sum = 0;
    int num = input.nextInt();

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < num) sum += arr[i];
    }

    System.out.println(sum);
  }
}
