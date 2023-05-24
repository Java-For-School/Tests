public class Main {
  public static Node<Student> addToList(Node<Student> list, Student student) {
    if (list == null) return new Node<Student>(student);
    Node<Student> temp = list;
    while (temp.getNext() != null) temp = temp.getNext();
    list.setNext(new Node<Student>(student));
  }
  public static Node<Student>[] getBirthArray(School school) {
    Node<Student>[] birthArray = new Node<Student>[12];
    
    for (int i = 0; i < school.getStudentsArr().length; i++) {
      Node<Student> temp = school.getStudentsArr()[i];

      while (temp != null) {
        Student student = temp.getValue();
        int month = student.getBirth().getMonth();
        birthArray[month -1] = addToList(birthArray[month - 1], student);
        temp = temp.getNext();
      }
    }
    
    return birthArray;
  }
}
