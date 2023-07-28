
public class StaffList implements Iterable {

    private Employee[] employees;

    public Employee[] getEmployees(){
        return employees;
    }

    public StaffList(Employee...employees){
        this.employees = employees;
    }

    @Override
    public StaffListIterator iterator() {
        return new StaffListIterator(this);
    }
}
