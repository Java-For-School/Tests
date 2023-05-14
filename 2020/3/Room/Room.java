public class Room {
  private int roomNum;
  private int roomType;
  private int nightsReserved;
  
  public int income() {
    return this.roomType * this.nightsReserved * 50;
  }
}
