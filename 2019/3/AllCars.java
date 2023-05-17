public class AllCars {
  private Car[] cars;
  private int num;

  public AllCars(int max) {
    this.cars = new Car[max];
    this.num = 0;
  }

  public boolean addCar(Car car) {
    if (num == this.cars.length) return false;
    this.cars[num] = car;
    this.num++;
    return true;
  }

  public void print(int min, int max) {
    for (int i = 0; i < this.cars.length; i++) {
      if (this.cars[i].range(min, max) && !this.cars[i].getHadAccident()) {
        System.out.println(this.cars[i].getLicenseNum());
      }
    }
  }
}
