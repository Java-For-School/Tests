public class Main {
  public static RestTable[] getFreeTables(RestTable[] tables) {
    int count = 0;
    
    for (int i = 0; i < tables.length; i++) {
      if (tables[i].getNotBusy()) count++;
    }

    RestTable[] freeTables = new RestTable[count]; 
    int index = 0;

    for (int i = 0; i < tables.length; i++) {
      if (tables[i].getNotBusy()) {
        freeTables[index] = tables[i];
      }
    }

    return freeTables;
  }
  public static int perfectTable(RestTable[] freeTables, int diners) {
    for (int i = 0; i < freeTables.length; i++) {
      if (freeTables[i].getSeats() == diners) return freeTables[i].getNum();
    }

    return -1;
  }
  public static void canAccept(RestTable[] t, Order x) {
    RestTable[] freeTables = getFreeTables(t);
    int s = x.getDiners();
    int p = perfectTable(freeTables, s);

    if (p != -1) {
      System.out.println(p);
      return;
    }

    for (int i = 0; i < freeTables.length - 2; i++) {
      sum = freeTables[i].getSeats();
      for (int j = 0; j < freeTables.length - 1; j++) {
        sum += freeTables[j].getSeats();
        if (sum == s) {
          System.out.println(freeTables[i].getNum() + " " + freeTables[j].getNum());
          return;
        }
        for (int k = 0; k < freeTables.length; k++) {
          sum += freeTables[k].getSeats();
          if (sum == s) {
            System.out.println(freeTables[i].getNum() + " " + freeTables[j].getNum() + " " + freeTables[k].getNum());
            return;
          }
        }
      }
    }

    System.out.println("None!");
  }
}
