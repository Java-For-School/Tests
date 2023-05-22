public class A {
  private int n1;
  private int n2;

  public A() {
    this.n1 = 0;
    this.n2 = 0;
  }
  public A(int n1, int n2) {
    this.n1 = n1;
    this.n2 = n2;
  }

  public int getN1() {
    return this.n1;
  }

  public int getN2() {
    return this.n2;
  }
  
  public int setN1(int n1) {
    this.n1 = n1;
  }

  public int setN2(int n2) {
    this.n2 = n2;
  }

  public void add(int number) {
    this.setN1(this.getN1() + number);
    this.setN2(this.getN2() + number); 
  }

  public String toString() {
    return this.getN1() + " + " + this.getN2() + " = " + (this.getN1() + this.getN2()); 
  }
}
