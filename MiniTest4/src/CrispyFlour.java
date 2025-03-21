import java.time.LocalDate;

public class CrispyFlour extends Material implements Discount {
    private int quantity;

    public CrispyFlour() {

    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return quantity * this.cost;
    }

    @Override
    public double getRealMoney() {
        return cost - ((double) cost * 5 / 100);
    }

    @Override
    public LocalDate getExpiryDate() {
        return manufacturingDate.minusYears(1);
    }

    @Override
    public String toString() {
        return "CrispyFlour{" +
                "quantity = " + quantity +
                ", id = '" + id + '\'' +
                ", name = '" + name + '\'' +
                ", manufacturingDate: " + manufacturingDate +
                ", cost = " + cost +
                '}';
    }
}
