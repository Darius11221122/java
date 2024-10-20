public class Employee {
    private static int employeeCounter = 1000;
    private int employeeId;
    private String name;
    private String employeeType;
    private Address address;
    private String companyCar;

    public Employee(String name, Address address, String employeeType, String companyCar) {
        this.employeeId = employeeCounter++;
        this.name = name;
        this.address = address;
        this.employeeType = employeeType;
        if (employeeType.equals("Manager")) {
            this.companyCar = companyCar;
        }
    }

    @Override
    public String toString() {
        String carInfo = (companyCar != null) ? ", Company Car: " + companyCar : "";
        return "ID: " + employeeId + ", Name: " + name + ", Type: " + employeeType +
                ", Address: [" + address + "]" + carInfo;
    }
}
