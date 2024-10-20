public class Main {
    public static void main(String[] args) {
        MyHrSystem hrSystem = new MyHrSystem();

        try {
            System.out.println(hrSystem.createEmployee("Alice Smith", "123 Main St", "Springfield", "Somerset", "Staff", null));
            System.out.println(hrSystem.createEmployee("John Doe", "456 Oak Rd", "Greenfield", "Berkshire", "Manager", "Tesla Model 3"));
            System.out.println(hrSystem.createEmployee("Bob Johnson", "789 Pine Ln", "Riverside", "Yorkshire", "Staff", null));
            System.out.println(hrSystem.createEmployee("Carol White", "321 Birch Dr", "Hillview", "Dorset", "Manager", "BMW X5"));
            System.out.println(hrSystem.createEmployee("Eve Black", "654 Cedar St", "Lakeside", "Devon", "Staff", null));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        System.out.println("\nList of Offices:");
        System.out.println(hrSystem.listOffices());

        System.out.println("\nList of Employees:");
        System.out.println(hrSystem.listEmployees());
    }
}
