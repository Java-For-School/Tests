class TaskManager {
  Stack<Task> urgent; // Most urgent tasks
  Stack<Task> important; // Average task
  Queue<Task> regular; // Task which is not particularly important in the present

  public TaskManager() {
    this.urgent = new Stack<Task>();
    this.important = new Stack<Task>();
    this.regular = new Queue<Task>();
  }

  public Task getFirstTask() {
    if (!urgent.isEmpty()) return this.urgent.pop();
    if (!important.isEmpty()) return this.important.pop();
    return this.regular.remove();
  }
  
  public void insertTask(Task task) {
    if (task.getCode() == 1) this.urgent.push(task);
    else if (task.getCode() == 2) this.important.push(task);
    else this.regular.insert(task);
  }
}
