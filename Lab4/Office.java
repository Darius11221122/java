import java.util.ArrayList;

public class Office {
    private static int officeCounter = 100;
    private int roomNumber;
    private ArrayList<Employee> employees;

    public Office() {
        this.roomNumber = officeCounter++;
        this.employees = new ArrayList<>();
    }

    public void assignEmployee(Employee employee) throws Exception {
        if (employees.size() < 2) {
            employees.add(employee);
        } else {
            throw new Exception("Office " + roomNumber + " is full.");
        }
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Office ").append(roomNumber).append(":\n");
        if (employees.size() == 0) {
            sb.append("No employees assigned.\n");
        } else {
            for (Employee employee : employees) {
                sb.append(employee.toString()).append("\n");
            }
        }
        return sb.toString();
    }
}
