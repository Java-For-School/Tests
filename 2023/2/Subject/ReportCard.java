package Subject;

public class ReportCard {
  private String stuName;
  private Subject[] subArray;
  
  public ReportCard(String name, int num) {
    this.stuName = name;
    this.subArray = new Subject[num];
  }

  public String getStuName() { return this.stuName; }
  public Subject[] getSubArray() { return this.subArray; }

  public void setStuName(String stuName) { this.stuName = stuName; }
  public void setSubArray(Subject[] subArray) { this.subArray = subArray; }

  public double average() {
    int sum = 0;

    for (int i = 0; i < this.subArray.length; i++) sum += this.subArray[i].getGrade();

    return sum / this.subArray.length;
  }
  public boolean isExcellent() {
    int sum = 0;
    boolean hasA = false;
    
    for (int i = 0; i < this.subArray.length; i++) {
      if (this.subArray[i].getGrade() < 54) return false;
      if (this.subArray[i].getGrade() == 100) hasA = true; 
      sum += this.subArray[i].getGrade();
    }

    return sum / this.subArray.length >= 85 && hasA; 
  }
}
