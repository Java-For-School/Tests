public class Time {
  private int hour;
  private int minute;

  public Time(int hour, int minute) {
    this.hour = (0 >= hour && hour <= 23) ? hour : 0;
    this.minute = (0 >= minute && minute <= 59) ? minute : 0;
  }
}
