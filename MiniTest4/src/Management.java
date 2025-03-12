import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Management {
    List<Material> materialList = new ArrayList<>();
    int materialCount = 0;

    public void add(Material material) {
        materialList.add(material);
        materialCount++;
    }

    public void remove(String id) {
        for (Material material : materialList) {
            if (material.getId().equals(id)) {
                materialList.remove(material);
                materialCount--;
                break;
            }
        }
    }

    public void review() {
        for (Material material : materialList) {
            System.out.println(material);
        }
    }

    public void changeMaterial(Material material, String id) {
        for (int i = 0; i < materialList.size(); i++) {
            if (materialList.get(i).getId().equals(id)) {
                materialList.set(i, material);
                break;
            }
        }
    }

    public void getTotalCost() {
        int totalCost = 0;
        for (Material material : materialList) {
            totalCost += material.getCost();
        }
        System.out.println("Total cost: " + totalCost);
    }

    public void costOrder() {
        materialList.sort(new Comparator<Material>() {
            @Override
            public int compare(Material o1, Material o2) {
                return o1.getCost() - o2.getCost();
            }
        });
        for (Material material : materialList) {
            System.out.println(material.getId() + " " + material.getCost());
        }
    }

    public void totalDiscountCost() {
        int totalDiscountCost = 0;
        for (Material material : materialList) {
            totalDiscountCost += (int) material.getRealMoney();
        }
        System.out.println("Total discount cost: " + totalDiscountCost);
    }

    public int totalCostDifference() {
        int totalCostDifference = 0;
        for (Material material : materialList) {
            totalCostDifference += (int) (material.getCost() - material.getRealMoney());
        }
        return totalCostDifference;
    }
}
