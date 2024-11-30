public class HGV extends RoadVehicle implements ImportDuty {
    private double price;

    public HGV(String type, String model, double price) {
        super(type, model);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double calculateDuty() {
        return price * HGVTAXRATE;
    }
}
