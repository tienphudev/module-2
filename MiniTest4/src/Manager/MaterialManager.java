package Manager;

import model.Material;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaterialManager {
    private List<Material> materials;

    public MaterialManager() {
        materials = new ArrayList<>();
    }

    public void addMaterial(Material material) {
        materials.add(material);
        System.out.println("Thêm vật liệu thành công.");
    }

    public void editMaterial(String materialId, Material newMaterial) {
        for (int i = 0; i < materials.size(); i++) {
            if (materials.get(i).getId().equals(materialId)) {
                materials.set(i, newMaterial);
                System.out.println("Sửa thông tin vật liệu thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy vật liệu có ID: " + materialId);
    }

    public void deleteMaterial(String materialId) {
        for (int i = 0; i < materials.size(); i++) {
            if (materials.get(i).getId().equals(materialId)) {
                materials.remove(i);
                System.out.println("Xóa vật liệu thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy vật liệu có ID: " + materialId);
    }

    public double calculateTotalAmount() {
        double totalAmount = 0;
        for (Material material : materials) {
            totalAmount += material.getAmount();
        }
        return totalAmount;
    }

    public void sortMaterialsByPrice() {
        Collections.sort(materials, Comparator.comparingInt(Material::getCost));
    }
}


