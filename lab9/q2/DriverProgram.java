public class DriverProgram {
    public static void main(String[] args) {
        ImportDuty[] vehicles = new ImportDuty[2];

        Car car = new Car("car", "sedan", 20000);
        HGV hgv = new HGV("hgv", "truck", 50000);

        vehicles[0] = car;
        vehicles[1] = hgv;

        for (ImportDuty vehicle : vehicles) {
            if (vehicle instanceof Car) {
                Car c = (Car) vehicle;
                System.out.println("type: car");
                System.out.println("model: " + c.getModel());
                System.out.println("price: $" + c.getPrice());
                System.out.println("duty: $" + c.calculateDuty());
            } else if (vehicle instanceof HGV) {
                HGV h = (HGV) vehicle;
                System.out.println("type: hgv");
                System.out.println("model: " + h.getModel());
                System.out.println("price: $" + h.getPrice());
                System.out.println("duty: $" + h.calculateDuty());
            }
            System.out.println();
        }
    }
}
