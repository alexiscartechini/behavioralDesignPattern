public class Main {

  //Use the iterator pattern to traverse the list and print out the name;
  public static void main(String[] args) {

    Employee zak = new Employee("Zak");
    Employee sarah = new Employee("Sarah");
    Employee anna = new Employee("Anna");

    StaffList staffList = new StaffList(zak, sarah, anna);
    StaffListIterator staffListIterator = staffList.iterator();

    while(staffListIterator.hasNext()){
        Employee employee = staffListIterator.next();
        System.out.println(employee.getName());
    }

  }
}
