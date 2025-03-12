import java.time.LocalDate;

public class MaterialManagement {
    public static void main(String[] args) {
        Management allMaterial = new Management();
        allMaterial.add(new CrispyFlour("001", "FlameFlour",
                LocalDate.of(2024, 8, 12), 12000, 3));
        allMaterial.add(new CrispyFlour("002", "Semolina",
                LocalDate.of(2024, 3, 18), 23000, 2));
        allMaterial.add(new CrispyFlour("003", "CakeFlour",
                LocalDate.of(2024, 6, 4), 40000, 1));
        allMaterial.add(new CrispyFlour("004", "BreadFlour",
                LocalDate.of(2024, 1, 20), 5000, 6));
        allMaterial.add(new CrispyFlour("005", "PastryFlour",
                LocalDate.of(2024, 10, 30), 35000, 2));
        allMaterial.add(new Meat("A01", "chicken breast",
                LocalDate.of(2023, 12, 1), 45000, 1.5));
        allMaterial.add(new Meat("A02", "pork",
                LocalDate.of(2023, 10, 15), 20000, 1.5));
        allMaterial.add(new Meat("A03", "beef",
                LocalDate.of(2023, 2, 8), 30000, 1.5));
        allMaterial.add(new Meat("A04", "Poultry",
                LocalDate.of(2023, 6, 7), 17000, 1.5));
        allMaterial.add(new Meat("A05", "lamb",
                LocalDate.of(2023, 2, 1), 10000, 1.5));
        allMaterial.review();
        allMaterial.getTotalCost();
        allMaterial.totalDiscountCost();
        allMaterial.costOrder();
        System.out.println("The difference between total amount before discount and after total discount cost: "
                + allMaterial.totalCostDifference());
    }

}
