public class Hostel {
  Room[] allRooms;

  public int orderRoom(int type, int nights) {
    for (int i = 0; i < this.allRooms.length; i++) {
      if (this.allRooms[i].getNightsReserved() == 0 && this.allRooms[i].getType() == type) {
        this.allRooms[i].setNightsReserved(nights);
        return i;
      }

      return -1;
    }
  }
  public int[] floorIncome() {
    int[] income = new int[3];
    
    income[0] = 0;
    income[1] = 0;
    income[2] = 0;
    
    for (int i = 0; i < this.allRooms.length; i++) {
      income[this.allRooms[i].roomNum / 100 - 1] += this.allRooms[i].income();
    }
  }
}
