import Manager.MaterialManager;
import model.CrispyFlour;
import model.Meat;

public class Main {
    public static void main(String[] args) {
        MaterialManager manager = new MaterialManager();
        for (int i = 0; i < 5; i++) {
            manager.addMaterial(new CrispyFlour("C" + i, "CrispyFlour" + i, 100, i + 1));
            manager.addMaterial(new Meat("M" + i, "Meat" + i,  200, 20));
        }

    }
}