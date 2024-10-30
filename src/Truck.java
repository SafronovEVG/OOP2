public class Truck extends Transport implements PrintService {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        System.out.println("Проверяем двигатель");
        System.out.println("Проверяем прицеп");
    }
}