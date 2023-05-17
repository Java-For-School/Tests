public class Car {
  private String licenseNum;
  private boolean hadAccident;
  private int price;

  public boolean range(int min, int max) {
    return (this.price >= min && this.price <= max);
  }
}
