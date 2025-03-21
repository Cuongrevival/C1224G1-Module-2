import java.time.LocalDate;

public class Meat extends Material implements Discount{
    private double weight;

    public Meat(double weight) {
        this.weight = weight;
    }

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return cost * weight;
    }

    @Override
    public LocalDate getExpiryDate() {
        return manufacturingDate.plusDays(7);
    }

    @Override
    public double getRealMoney() {
        return cost - ((double) (cost * 10) / 100);
    }

    @Override
    public String toString() {
        return "Meat{" +
                "weight = " + weight +
                ", id = '" + id + '\'' +
                ", name = '" + name + '\'' +
                ", manufacturingDate: " + manufacturingDate +
                ", cost = " + cost +
                '}';
    }
}
