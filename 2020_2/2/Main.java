import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

  }
  public static void doctorRating(Doctor[] doctors) {
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < doctors.length; i++) {
      double totalRate = 0;
      double rateCount = 0;
      boolean isFinished = false;
      while (!isFinished) {
        double rate = scanner.nextDouble();
        if (rate == -1) isFinished = true;
        else {
          totalRate += rate;
          rateCount++;
        }
      }

      doctors[i].setRate(totalRate / rateCount);
    }
  }
}
