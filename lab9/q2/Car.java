public class Car extends RoadVehicle implements ImportDuty {
    private double price;

    public Car(String type, String model, double price) {
        super(type, model);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double calculateDuty() {
        return price * CARTAXRATE;
    }
}
