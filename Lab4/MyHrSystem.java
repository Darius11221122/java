import java.util.ArrayList;

public class MyHrSystem {
    private ArrayList<Office> offices;
    private ArrayList<Employee> employees;

    public MyHrSystem() {
        offices = new ArrayList<>();
        employees = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            offices.add(new Office());
        }
    }

    public String createEmployee(String name, String street, String city, String county, String employeeType, String companyCar) throws Exception {
        if (employees.size() >= 5) {
            throw new Exception("Maximum number of employee records reached.");
        }

        Address address = new Address(street, city, county);
        Employee employee = new Employee(name, address, employeeType, companyCar);

        for (Office office : offices) {
            if (office.getEmployees().size() < 2) {
                office.assignEmployee(employee);
                employees.add(employee);
                return "Employee " + name + " (ID: " + employee.toString() + ") assigned to Office " + office.toString();
            }
        }

        throw new Exception("All offices are full.");
    }

    public String listOffices() {
        StringBuilder sb = new StringBuilder();
        for (Office office : offices) {
            sb.append(office.toString()).append("\n");
        }
        return sb.toString();
    }

    public String listEmployees() {
        if (employees.size() == 0) {
            return "No employees have been created yet.";
        }
        StringBuilder sb = new StringBuilder();
        for (Employee employee : employees) {
            sb.append(employee.toString()).append("\n");
        }
        return sb.toString();
    }
}
