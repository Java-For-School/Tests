public class Main {
  public static void main(String[] args) {
  
  }
  public static int theWinner(Vote[] votes) {
    int[] rates = new int[40];
    for (int i = 0; i < rates.length; i++) rates[i] = 0;
      
    for (int i = 0; i < votes.length; i++) {
      rates[votes[i].getFirst()] += 7;
      rates[votes[i].getSecond()] += 5;
      rates[votes[i].getThird()] += 1;
    }
    int max = rates[0];
    int maxPos = 0;

    for (int i = 0; i < rates.length; i++) {
      if (max < rates[i]) {
        max = rates[i];
        maxPos = i;
      }
    }

    return maxPos;
  }
}
