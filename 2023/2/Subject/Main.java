public class Main {
  public static void main(String[] args) {

  }
  private void printExcellent(ReportCard[] cards) {
    for (int i = 0; i < cards.length; i++) {
      if (cards[i].isExcellent) System.out.println(cards[i].getStuName());
    }
  }
}
