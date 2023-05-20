public class Student {
  private String name;
  private int[] arrTest;

  public double getAverageGrade() {
    int sum = arrTest[0] + arrTest[1] + arrTest[2];
    return (double) (sum / 3);
  }
}
