public class HotDrink extends Drink {
    private Double temperature;

    public HotDrink (String name, Double temperature, Double volume,  Double cost) {
        super(name, volume, cost);
        this.temperature = temperature;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HoteDrink{" +
                "Name=" + super.getName() +
                ", Cost=" + super.getVolume() +
                ", Volume=" + super.getCost() +
                ", Temperature=" + temperature +
                '}';
    }
}