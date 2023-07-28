import java.util.Iterator;

public class StaffListIterator implements Iterator {

    private StaffList staffList;
    private int index;

    public StaffListIterator(StaffList staffList){
        this.staffList = staffList;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        Employee[] employees = staffList.getEmployees();
        return index < employees.length;
    }

    @Override
    public Employee next() {
        Employee[] employees = staffList.getEmployees();
        if(hasNext()){
            return employees[index++];
        } else {
            return null;
        }
    }
}
